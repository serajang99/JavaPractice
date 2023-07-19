package Algo.boj.b11399;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = N - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					int t = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		int[] sum_arr = new int[N+1];
		for (int i = 1; i < sum_arr.length; i++) {
			sum_arr[i] = sum_arr[i-1] + arr[i-1];
		}
		
		int sum = 0;
		for (int i : sum_arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}
