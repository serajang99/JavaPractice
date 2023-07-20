package Algo.boj.b15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static int N, M;
	static int[] result;
	static int[] before;
	static LinkedHashSet<String> resultArr;

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
		resultArr = new LinkedHashSet<String>();
		recur(0);
		resultArr.forEach(System.out::println);
	}

	private static void recur(int depth) {

		if (depth == M) {
			StringBuilder sb = new StringBuilder();
			for (int r : result)
				sb.append(r).append(' ');
			resultArr.add(sb.toString());
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

}
