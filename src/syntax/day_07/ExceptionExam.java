package syntax.day_07;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExam {
	public static void main(String[] args)  {
		try {
			readFile2();
			System.out.println("파일처리성공");
		} catch (FileNotFoundException e) {
			System.err.println("파일처리실패");
		}
		
	} // end main

	private static void readFile() {
		// 파일에서 문자를 읽기
		try {
			FileReader fr = new FileReader("poem.txt"); // 현재 폴더(프로젝트 폴더)에서 파일 찾음
			System.out.println("파일 열기 성공");
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음"); // 정상적인 상황의 메세지 출력
			System.err.println("파일 없음"); // 오류 상황의 메세지 출력
			e.printStackTrace();
		}
	}
	private static void readFile2() throws FileNotFoundException {
		// 파일에서 문자를 읽기
		FileReader fr = new FileReader("poem.txt");
		System.out.println("파일 열기 성공");
	}
}
