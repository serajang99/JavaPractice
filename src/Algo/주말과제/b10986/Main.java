package Algo.주말과제.b10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력을 위한 BufferedReader 사용
		StringTokenizer st = new StringTokenizer(br.readLine()); // 한줄 읽어서 StringTokenizer에 넣기
		
		int N = Integer.parseInt(st.nextToken()); // 숫자 갯수
		int M = Integer.parseInt(st.nextToken()); // 나눌 수
		long[] arr = new long[1000001]; // 구간 합 배열
		long[] cnt = new long[1001]; // 나머지 값으로 나올 수 있는 각 숫자가 몇 번 나왔는지 카운트 배열
		long result = 0; // 구간 합이 M으로 나누어 떨어지는 쌍의 개수
		
		st = new StringTokenizer(br.readLine()); // 한줄 읽어서 StringTokenizer에 넣기
		for (int i = 1; i < N+1; i++) // 숫자 배열 입력
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken()); // 구간 합으로 입력
		
		for (int i = 0; i < N+1; i++) {
			arr[i] %= M; // 각 구간 합의 M으로 나눈 나머지 값으로 변경
			cnt[(int) arr[i]]++; // 나머지 값을 몇 번 나왔는지 카운트하기 위해 1 증가
		}
		
		// 같은 나머지 값끼리 빼면 구간 합이 M으로 나눴을 때 나누어 떨어진다.
		for (int i = 0; i < M; i++) { 
			if(cnt[i] > 1) // nC2가 성립해야되므로 n은 2이상이어야 한다.
				result += cnt[i]*(cnt[i]-1)/2; // 각 카운트 배열의 값을 n이라 두면 각 경우의 값이 nC2이므로 이 값을 result에 더한다.
		}
		System.out.println(result); // result를 출력한다.
	}
}

