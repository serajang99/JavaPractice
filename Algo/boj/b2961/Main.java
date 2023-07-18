package b2961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] S;
	static int[] B;
	static int[] S_mul;
	static int[] B_sum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = new int[N];
		B = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken()); // 신맛
			B[i] = Integer.parseInt(st.nextToken()); // 쓴맛
		}
		
		S_mul = new int[1 << N];
		B_sum = new int[1 << N];
		bit();

		int result = 1000000001;
		for (int i = 1; i < 1 << N; i++)
			result = Math.min(result, Math.abs(S_mul[i] - B_sum[i]));

		System.out.println(result);

	}

	static void bit() {
		for (int i = 1; i < 1 << N; i++) {
			int mul = 1;
			int sum = 0;
			for (int j = 0; j < N; j++) 
				if ((i & 1 << j) != 0) {
					mul *= S[j];
					sum += B[j];
				}
			S_mul[i] = mul;
			B_sum[i] = sum;
		}
	}


}
