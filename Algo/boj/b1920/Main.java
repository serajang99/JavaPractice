package 이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// b1920

public class Main {
	
	static int N;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr  = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			int result = binarySearch(num, 0, N-1);
			System.out.println(result);
		}
	}

	private static int binarySearch(int num, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] > num) {
				end = mid-1;
			} else if (arr[mid] == num) {
				return 1;
			} else {
				start = mid+1;
			}
		}
		
		return 0;
	}
}
