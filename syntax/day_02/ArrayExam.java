package day_02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] arr; // 선언
		arr = new int[3]; // 대입(빈 배열)
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr);
//		[I@3d012ddd
//		[:배열 I:int @:구분자 ~:참조값
		
		// 변수 선언할 때 배열 대입
		// 선언, 대입을 한꺼번에 (초기화할 때만) 
		// 배열 상수는 static에 저장되기 때문에 메모리관리를 잘 못하기 쉬움 -> 웬만해서 배열 상수는 잘 안쓰는게 좋다.
		// 메모리 자동관리는 heap만 적용
		int[] arr2 = {100, 200, 300}; 
//		arr2 = {100, 200, 300}; 
//		Array constants can be only used in initializers.
		System.out.println(arr2[2]);
		
		// heap 공간에 메모리를 만듦
		// 중간에 값을 바꿀때도 사용 가능
		int[] arr3 = new int[] {100, 200, 300}; // 1 <- arr3
		arr3 = new int[] {400, 500, 600}; // 2 <- arr3, 1은 garbage 처리
		System.out.println(arr3[2]);
		
		String s = "kim"; 
		// literal: 타입을 값으로 표현 -> 재활용할 목적으로 method 영역에 만들어짐
		// 원래 형태: new String("kim") - heap 공간에 메모리 만듦
		int i = 50;
		System.out.println(arr3.length);
		
	}
}
