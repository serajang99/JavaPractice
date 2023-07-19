package Algo.boj.b11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		result = 0;
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i);
				result++;
			}
		}
		System.out.println(result);

	}

	private static void dfs(int i) {
		visited[i] = true;
		for (Integer n : graph.get(i)) {
			if (visited[n] == false) {
				visited[n] = true;
				dfs(n);
			}
		}
		
	}
}
