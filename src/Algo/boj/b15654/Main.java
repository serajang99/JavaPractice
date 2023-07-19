package Algo.boj.b15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static int N, M;
	static int[] result;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		visited = new boolean[N];
		result = new int[M];

		recur(0);

	}

	private static void recur(int depth) {
		if (depth == M) {
			printResult();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				result[depth] = arr[i];
				visited[i] = true;
				recur(depth + 1);
				visited[i] = false;
			}
		}
	}

	private static void printResult() {
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
