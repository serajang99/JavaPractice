package Algo.swea.swea2806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	
	static int[] arr;
	static int cnt;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= T; test_case++){
			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			cnt = 0;
			nQueen(0);
			System.out.println("#"+test_case+" "+cnt);
		}
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
