package Algo.boj.b1325;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] cntArr;
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph.get(end).add(start);
		}

		cntArr = new int[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			visited = new boolean[N+1];
			q.add(i);
			visited[i] = true;
			while (!q.isEmpty()) {
				int node = q.poll();
				for (int n : graph.get(node)) {
					if(visited[n] == false) {
						q.add(n);
						visited[n] = true;
						cntArr[i]++;
					}
				}
			}
		}
		
		
		int maxcnt =0;
		for (int i = 1; i <= N; i++) {
			maxcnt = Math.max(maxcnt, cntArr[i]);
		}
		for (int i = 1; i <= N; i++) {
			if (cntArr[i] == maxcnt) {
				bw.write(i + " ");
			}
		}
		bw.flush();
        bw.close();
	}
}
