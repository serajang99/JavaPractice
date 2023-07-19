package Algo.boj.b14940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static int[][] arr;
	static int[][] newArr;
	static boolean[][] visited;
	static Queue<int[]> q;
	static int[][] di;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		newArr = new int[n][m];
		visited = new boolean[n][m];
		int startX = 0, startY = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 2) {
					startX = i;
					startY = j;
				}
			}
		}

		di = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		q = new LinkedList<int[]>();
		q.add(new int[] { startX, startY, 0 });
		visited[startX][startY] = true;
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			int x = tmp[0];
			int y = tmp[1];
			int cnt = tmp[2];
			newArr[x][y] = cnt;
			for (int i = 0; i < di.length; i++) {
				int newX = x + di[i][0];
				int newY = y + di[i][1];
				if (inRange(newX, newY)) {
					if (visited[newX][newY] == false) {
						q.add(new int[] { newX, newY, cnt + 1 });
						visited[newX][newY] = true;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!visited[i][j] && arr[i][j] == 1)
					System.out.print("-1 ");
				else
					System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static boolean inRange(int newX, int newY) {
		if (newX >= 0 && newX < n && newY >= 0 && newY < m && arr[newX][newY] == 1) {
			return true;
		}
		return false;
	}
}
