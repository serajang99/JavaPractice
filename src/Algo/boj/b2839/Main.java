package Algo.boj.b2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int cnt = 0, tmp = N;
		while (true) {
			if (N % 5 == 0) {
				cnt += N / 5;
				System.out.println(cnt);
				break;
			} else if (N < 0) {
				System.out.println(-1);
				break;
			}
			N -= 3;
			cnt++;
		}

	}
}
