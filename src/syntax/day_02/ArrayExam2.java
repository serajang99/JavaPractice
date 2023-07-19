package syntax.day_02;

public class ArrayExam2 {
	public static void main(String[] args) {
		
		// method안에 선언된 변수는 stack에 생성
		int i = 5;
		int[] arr = new int[] {10, 20, 30}; // new -> heap 공간에 메모리 올림
		int[][] arr2 = {{80,90,96}, {76,88}}; // arr2: 2차원 배열, arr2[0]: 1차원 배열 
		// ga
		// Java는 255차원 배열까지 가능
		System.out.println(arr2); // [[I@3d012ddd [[:2차원 배열
		System.out.println(arr2[0]); // [I@626b2d4a [:1차원 배열
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[0][0]); // 80 arr2[0][0]가 변수명이 된다
		
		int[][] arr3 = new int[][] {
			new int[] {80,90,96},
			new int[] {76, 88}
		};
		// 처음 부분만 확정, 뒷 부분은 나중에
		int[][] arr4 = new int[2][];
		arr4[0] = new int[3];
		arr4[1] = new int[2];
		arr4[0][0] = 80;
		arr4[0][1] = 90;
		arr4[0][2] = 96;
		arr4[1][0] = 76;
		arr4[1][1] = 88;
		
		
	}
}
