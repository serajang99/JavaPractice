package Algo.test.kb1반_장서우_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 당신은 유퀴즈에 수학 천재로 출연하게 되었다.
 * 수학 천재임을 증명하기 위해 유재석이 내는 숫자 합 퀴즈를 맞춰야 한다.
 * 숫자 합 퀴즈는 주어진 숫자 중 세 개의 수를 골라, 세 수의 합이 유재석이 불러주는 숫자를 넘지 않으면서 
 * 숫자 합을 가장 크게 만드는 게임이다. 
 * 숫자는 3개에서 100개 사이로 주어지며, 각 수의 크기는 10 이상 300,000 이하이다.
 * 이 중 세 개의 숫자를 골라 유재석이 불러준 숫자 이하이면서 세 수의 합이 가장 큰 수가 되는 숫자 합을 출력하자.
 * 예를 들어 6개의 수 5, 20, 45, 69, 65, 70이 주어지고 유재석이 96을 부르면,
 * 5, 20, 70 을 더해 95를 만든다. 95는 유재석이 부른 수 96 이하이면서 만들 수 있는 최대의 수이다.
 * 
 * 입력은 첫째 줄에 사용 가능한 숫자 개수 N(3이상 100이하)과 최대 숫자 합 M(10이상 300,000이하)
 * 둘째 줄에 100, 000을 넘지 않는 양의 정수 N개가 주어진다.
 * 
 * */
public class kb1반_알고리즘2번_장서우 {
	static int T; // test case 수
	static int N; // 재료 수
	static int M; // 제한 칼로리
	static int maxsum;
	static int[] arr;
	static int[] result;
	static boolean[] visited; // 사용여부

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < N; j++) {
			arr[j] = Integer.parseInt(st.nextToken()); // 숫자 배열
		}
		
		result = new int[3];
		recur(0,0);
		System.out.println(maxsum);
	}
	
	private static void recur(int depth, int start) {
		// 종료 조건
		if (depth == 3) { 
			int sum = 0;
			for (int i : result) { 
				sum += i; 
			}
			if(sum <= M) {
				maxsum = Math.max(maxsum, sum);
			}
			return;
		}
		// 처리코드(result에 숫자 누적)
		for (int i = start; i < arr.length; i++) {
			// arr[i] 숫자가 미사용인 경우에만 사용
			if (visited[i] == false) {
				result[depth] = arr[i]; // 깊이 자리에 i번째 숫자 저장
				visited[i] = true; //
				recur(depth + 1, i + 1); // 깊이 증가 후 재귀호출
				visited[i] = false; //
			}

		}
	}
	
}
