package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * 특정 경로의 동일 해시 값 찾기
 */
public class Main {
	// 중복 파일 갯수
	private static int count = 0;

	public static void main(String[] args) {
		try {
			// 윈도우 스타일 Look and Feel 적용
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		SwingUtilities.invokeLater(() -> {
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("C:\\"));
			chooser.setDialogTitle("폴더를 선택하세요");
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			chooser.setAcceptAllFileFilterUsed(false);

			int result = chooser.showOpenDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				File folder = chooser.getSelectedFile();
				System.out.println("선택한 폴더 경로: " + folder.getAbsolutePath());

				if (!folder.isDirectory()) {
					System.out.println("올바른 폴더 경로를 선택하세요.");
					return;
				}

				// 중복된 해시 값을 찾기 위한 맵
				Map<String, String> fileHashes = new HashMap<>();

				// 중복 탐색 로직 호출
				List<String> duplicates = findDuplicates(folder, fileHashes);
				duplicates.addFirst("중복된 파일 " + count + "개를 찾았습니다.");

				Path filePath = Paths.get("중복된 파일 리스트.txt");

				try {
					Files.write(filePath, duplicates); // UTF-8 기본 인코딩
					System.out.println("파일 저장 완료: " + filePath.toAbsolutePath());
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println("중복된 파일 " + count + "개를 찾았습니다.");

			} else {
				System.out.println("폴더 선택이 취소되었습니다.");
			}
		});
	}

	// 주어진 경로에서 모든 파일을 탐색하여 해시값 계산 후 중복 찾기
	private static List<String> findDuplicates(File folder, Map<String, String> fileHashes) {

		File[]       files   = folder.listFiles();
		List<String> dupFile = new ArrayList<String>();
		if (files == null)
			return dupFile;

		for (File file : files) {
			if (file.isDirectory()) {
				findDuplicates(file, fileHashes); // 재귀적으로 하위 폴더 탐색
			} else if (file.isFile()) {
				try {
					String hash = calculateFileHash(file); // 파일의 해시값 계산
					if (fileHashes.containsKey(hash)) {
						dupFile.add("중복된 파일 발견: ");
						dupFile.add("\t1: " + fileHashes.get(hash));
						dupFile.add("\t2: " + file.getAbsolutePath());
						count++;
					} else {
						fileHashes.put(hash, file.getAbsolutePath());
					}
				} catch (IOException e) {
					System.out.println("파일 해시 계산 오류: " + file.getAbsolutePath());
					e.printStackTrace();
				}
			}
		}

		return dupFile;
	}

	// 파일의 SHA-256 해시를 계산하는 메서드
	private static String calculateFileHash(File file) throws IOException {
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (Exception e) {
			throw new IOException("SHA-256 해시 알고리즘을 찾을 수 없습니다.", e);
		}

		try (FileInputStream fis = new FileInputStream(file)) {
			byte[] buffer = new byte[8192];
			int    bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				digest.update(buffer, 0, bytesRead);
			}
		}

		// 해시값을 16진수 문자열로 변환
		byte[]        hashBytes = digest.digest();
		StringBuilder hexString = new StringBuilder();
		for (byte b : hashBytes) {
			hexString.append(String.format("%02x", b));
		}
		return hexString.toString();
	}
}
