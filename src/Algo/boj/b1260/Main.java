package Algo.boj.b1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M, start;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(start).add(end);
			graph.get(end).add(start);
		}
		
		for (int i = 0; i <= N; i++) {
			Collections.sort(graph.get(i), (o1, o2) -> o1 - o2);
		}

		visited = new boolean[N+1];
		dfs(start);
		System.out.println();
		visited = new boolean[N+1];
		bfs(start);
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		visited[i] = true;
		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");
			for (int n : graph.get(node)) {
				if (visited[n] == false) {
					visited[n] = true;
					q.add(n);
				}
			}
		}
		System.out.println();
	}

	private static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");
		for (Integer n : graph.get(i)) {
			if (visited[n] == false) {
				dfs(n);
			}
		}
	}
}
