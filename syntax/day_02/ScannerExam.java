package day_02;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		// 공백 문자(띄어쓰기, 탭, 엔터)를 기준으로 분리 입력
//		sc.next(); // 글자 한 단어씩 추출(문자열)
//		sc.nextInt(); // 숫자 하나씩 추출
//		sc.nextLine(); // 한줄씩 추출(문자열)
		String name = sc.next(); // 엔터를 칠 때까지 대기 - 다음 행동을 할 때까지 기다리는 것(실행을 막는 것)을 Blocking Method라고 한다.
		System.out.println("이름은 " + name);
		System.out.println("태어난 해를 4자리로 입력하세요(예:1990) >> ");
		int y = sc.nextInt(); // 엔터를 칠 때까지 대기 - 다음 행동을 할 때까지 기다리는 것(실행을 막는 것)을 Blocking Method라고 한다.
		System.out.println("태어난 해는 " + y);
		int age = 2023-y;
		System.out.println("나이는 "+ age);
	}

}
