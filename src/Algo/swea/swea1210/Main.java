package Algo.swea.swea1210;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		for (int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			int[][] arr = new int[102][102];
			for (int i = 1; i < arr.length - 1; i++) {
				for (int j = 1; j < arr.length - 1; j++) {
					arr[i][j] = sc.nextInt();
					if (i == arr.length - 2 & arr[i][j] == 2)
						start = j;
				}
			}

			int dir = 1;
			int end = 1;
			int row = 101;
			int col = start;
			while (row > 0) {
//            	System.out.println("dir:"+dir+" row:"+row+" col"+col);
				if (dir == 1) {
					if (arr[row][col - 1] == 1) { // 왼
						dir = 2;
					} else if (arr[row][col + 1] == 1) { // 오
						dir = 3;
					}
				} else {
					if (arr[row + 1][col] == 1)
						dir = 1;
				}

				if (dir == 2)
					col -= 1;
				else if (dir == 3)
					col += 1;
				else {
					row -= 1;
				}
			}
			System.out.print("#" + test_case + " ");
			System.out.println(col - 1);
		}
	}
}