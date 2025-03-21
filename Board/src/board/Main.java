package board;

import java.util.Scanner;

// 게시판 콘솔 프로그램 UI
public class Main {

	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess();

		Scanner sc = new Scanner(System.in);

		int menuNo;

		do {

			System.out.println("::::: 게시판 :::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 게시판 닫기");
			System.out.print("메뉴 번호 : ");
			menuNo = sc.nextInt();
			sc.nextLine();

			if (menuNo == 0) {
				System.out.println("프로그램 종료");
				break;
			}

			switch (menuNo) {
				case 1:		// 게시글 목록

					Board[] boardList = boardInterface.list();
					if (boardList != null) {
						for (Board board : boardList) {
							if (board != null)
								System.out.println(board);
						}
					}
					break;

				case 2:		// 게시글 등록

					System.out.print("제목 : ");
					String createTitle = sc.nextLine();
					System.out.print("작성자 : ");
					String createWriter = sc.nextLine();
					System.out.print("내용 : ");
					String createContent = sc.nextLine();

					Board createBoard = new Board(createTitle, createWriter, createContent);
					Board createdBoard = boardInterface.create(createBoard);

					if (createdBoard != null) {
						System.out.println("::::: 등록된 게시글 정보 :::::");
						System.out.println(createdBoard);
					}
					break;

				case 3:		// 게시글 조회

					System.out.print("조회 할 게시글 번호 : ");
					int searchNo = sc.nextInt();
					sc.nextLine();
					Board searchResult = boardInterface.read(searchNo);
					if (null == searchResult)
						System.out.println("게시글이 존재하지 않습니다.");

					System.out.println("::::: 조회된 게시글 정보 :::::");
					System.out.println(searchResult);
					System.out.println();

					break;

				case 4:		// 게시글 수정

					System.out.print("게시글 번호 : ");
					int updateNo = sc.nextInt();
					sc.nextLine();
					System.out.print("제목 : ");
					String updateTitle = sc.nextLine();
					System.out.print("작성자 : ");
					String upateWriter = sc.nextLine();
					System.out.print("내용 : ");
					String updateContent = sc.nextLine();

					Board updateBoard = new Board(updateTitle, upateWriter, updateContent);
					updateBoard.setNo(updateNo);
					boolean updatedResult = boardInterface.update(updateBoard);

					if (updatedResult) {
						System.out.println("수정이 완료 되었습니다.");
					} else {
						System.out.println("수정에 실패하였습니다.");
					}

					break;

				case 5:		// 게시글 삭제

					System.out.print("삭제 할 글번호 : ");
					int deleteNo = sc.nextInt();
					sc.nextLine();
					boolean deletedResult = boardInterface.delete(deleteNo);
					if (deletedResult) {
						System.out.println("삭제가 완료 되었습니다.");
					} else {
						System.out.println("삭제에 실패하였습니다.");
					}

					break;
				default:
					break;
			}
		} while (true);
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
