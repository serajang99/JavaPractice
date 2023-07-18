package 숫자맞추기;

/*
 * 1.컴퓨터가 1~100사이 임의 정수를 하나 저장
 * 2. "1~100사이 숫자를 입력하세요" 출력
 * 3. 사용자는 1~100사이 임의의 술자를 입력
 * 4. 사용자 입력숫자가 컴퓨터 숫자와 같으면 "정답" 출력. 종료
 * 5. 사용자 입력숫자가 컴퓨터 숫자보다 작은면 "올려주세요" 출력
 * 6. 사용자 입력숫자가 컴퓨터 숫자보다 크면 "내려주세요" 출력
 * 7. 사용자가 정답을 입력할때까지 반복
 * */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100 + 1);
		System.out.println("1~100사이 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in); // Scanner는 한개만 생성
		int num = sc.nextInt();
		while (num != n) {
			if (num > n)
				System.out.println("내려주세요");
			else
				System.out.println("올려주세요");
			num = sc.nextInt();
		}
		System.out.println("정답");
	}
}
