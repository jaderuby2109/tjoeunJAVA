package SeleniumEx;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		// WebDriver 객체 생성
		WebDriver driver = new ChromeDriver();

		// 웹 페이지 열기
//		driver.get("https://www.notion.so/12-03-25-1c10e5a431aa80e0a8c9c115c864a950");
		driver.get("https://wwwaloha.oopy.io/fdb31d99-46d3-4439-bb8b-c035541bf692");

		// 특정 요소 찾기
		WebElement element = driver.findElement(By.className("notion-page-content"));

			
		String elementHtml = element.getAttribute("outerHTML");
		
		// 요소의 텍스트 가져오기
//		String elementText = element.getText();

		// 텍스트 출력
		System.out.println(elementHtml);

		// 브라우저 종료
		driver.quit();
		
		
		

        // 특정 요소 안에 있는 이미지 찾기 (예: CSS Selector로 찾기)
        WebElement imgElement = driver.findElement(By.cssSelector("div.example-class img")); // 이미지가 포함된 div 내의 img 요소

        // 이미지 URL 추출
        String imgUrl = imgElement.getAttribute("src");

        // 이미지 파일을 다운로드할 위치
        String fileName = "downloaded_image.jpg"; // 원하는 파일 이름 설정

        // 이미지를 다운로드하고 저장하기
//        FileUtils.copyURLToFile(new URL(imgUrl), new File(fileName));
//
//        System.out.println("이미지가 다운로드되었습니다: " + fileName);

        // 브라우저 종료
        driver.quit();
        
        
        
	}
}
