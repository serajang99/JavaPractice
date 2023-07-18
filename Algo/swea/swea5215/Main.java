package swea5215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	static int T; // test case 수
	static int N; // 재료 수
	static int L; // 제한 칼로리
	static int[] taste;
	static int[] cal;
	static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			taste = new int[N];
			cal = new int[N];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				taste[j] = Integer.parseInt(st.nextToken()); // 신맛
				cal[j] = Integer.parseInt(st.nextToken()); // 쓴맛
			}
			
			bit();

			System.out.println("#"+i+" "+result);
		}

	}

	static void bit() {
		result = 0;
		for (int i = 1; i < 1 << N; i++) {
			int t = 0;
			int c = 0;
			for (int j = 0; j < N; j++) 
				if ((i & 1 << j) != 0) {
					t += taste[j];
					c += cal[j];
				}
			if (c <= L)
				result = Math.max(result, t);
		}
	}
}
