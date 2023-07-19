package Algo.boj.b9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] arr;
	static int cnt;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        cnt = 0;
        nQueen(0);
        System.out.println(cnt);
	}

	private static void nQueen(int col) {
		if(col == N) {
			cnt ++;
			return;
		}
		for (int i = 0; i < N; i++) {
			arr[col] = i;
			if(Possibility(col)) {
				nQueen(col+1);
			}
		}
	}

	private static boolean Possibility(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[col] == arr[i])
				return false;
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i]))
				return false;
		}
		
		return true;
	}
}
