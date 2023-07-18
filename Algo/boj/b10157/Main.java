package b10157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();

		int num = sc.nextInt();
		System.out.println(num);
//		11 12 13 14 15 16 | 26 36 46 56 66 76 | 75 74 73 72 71 | 61 51 41 31 21 | 22
//		1  2  3  4  5  6  | 7  8  9  10 11 12 | 13 14 15 16 17 | 18 19 20 21 22 | 23

		int cnt = 0;
		int row = 1, col = 1;
		int n = 0;
		while (num > 0) {
			if (num > r) {
				row++;
				num -= r;
			} else {
				break;
			}
			if (num > c) {
				col++;
				num -= c;
			} else {
				break;
			}
			cnt++;
		}
		System.out.println("num: " + num);
		System.out.println("row: " + row%2);
		System.out.println("col: " + col%2);
		System.out.println("cnt: " + cnt/2);
		
		if (row % 2 == 0) {
			// 위쪽
			if (col % 2 == 0) {
				System.out.println("anscol: " + num);
				System.out.println("ansrow: " + row);
			} 
			// 오른쪽
			else {
				System.out.println("anscol: " + num);
				System.out.println("ansrow: " + row);
			}
		} else {
			//
			if (col % 2 == 0) {
				System.out.println("anscol: " + num);
				System.out.println("ansrow: " + row);
			} 
			//
			else {
				System.out.println("anscol: " + num);
				System.out.println("ansrow: " + row);
			}
		}
		
	}
}
