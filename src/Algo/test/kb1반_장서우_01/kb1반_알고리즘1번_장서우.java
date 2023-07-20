package Algo.test.kb1반_장서우_01;

import java.util.Scanner;

/**
 * 본래 선택정렬이란 특정 위치에 어떤 원소를 넣을지 선택하는 알고리즘이다.
 * 선택 정렬을 이용하여 내림차순으로 array를 정렬하고자 한다.
 * 아래의 주어진 코드를 완성하여 내림차순 선택 정렬 알고리즘을 완성하자.
 * 입력은 정렬할 원소의 개수 N (1이상 10,000이하)와 다음 N줄에 각 원소가 주어진다. 
 * 내림차순 정렬한 원소를 하나씩 출력한다. 각 원소의 크기는 1이상 10,000이하이다.
 * 
 * */
public class kb1반_알고리즘1번_장서우 {
	
	static int nx;
	static int[] x;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		nx = sc.nextInt();
		x = new int[nx];

		for (int i = 0; i < nx; i++) {
			x[i] = sc.nextInt();
		}

		selectionSort();
		for (int j = 0; j < nx; j++) {
			System.out.println(x[j]);
		}
	}
	
	private static void selectionSort() {
		for (int i = 0; i < nx - 1; i++) {
			int min = i;
			for (int j = i+1; j < nx; j++) {
				if (x[j] > x[min]) {
					min = j;
				}
			}
			swap(i, min);
		}
	}

	static void swap(int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
}
