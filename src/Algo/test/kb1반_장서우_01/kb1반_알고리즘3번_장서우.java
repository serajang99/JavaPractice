package Algo.test.kb1반_장서우_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 고등학교 동창인 박연진과 문동은이 오목을 두려고 한다. 
 * 오목이란 검은 바둑알과 흰 바둑알을 교대로 놓으면서 가로, 세로, 대각선 중 하나로 같은 색의 바둑알이 연속으로 5개가 놓이면 이기는 게임이다. 
 * 박연진은 검은 바둑알을, 문동은은 흰 바둑알을 사용하고 있다고 할 때 바둑판의 현재 상태를 보고, 누가 이겼는지 알아내보자. 
 * 바둑판의 크기는 19X19이며, 검은 바둑알은 1 흰 바둑알은 2 아직 놓이지 않은 자리는 0으로 표시 된다. 
 * 박연진이 이겼을 경우 1, 문동은이 이겼을 경우는 2, 승부가 나지 않았을 경우는 0 을 출력하고 
 * 만약 둘 중 한 명이 이겼다면 다음 줄에 연속된 다섯 바둑알의 가장 왼쪽 위에 놓인 바둑알의 위치를 가로 세로 순서를 함께 출력한다. 
 * 단 첫 줄의 번호는 1이다.
 * 
 * 단, 여섯 알 이상이 연속으로 놓인 경우 이긴 것이 아니며, 연진이와 동은이가 동시에 이기는 경우는 주어지지 않는다.
 * 
 */
public class kb1반_알고리즘3번_장서우 {

	static int[][] arr;
	static int[] dx = { 0, -1, 1, 1 };
	static int[] dy = { 1, 1, 0, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		arr = new int[19][19];

		for (int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 19; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); // 숫자 배열
			}
		}


		boolean check = false;
		out: for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (arr[i][j] != 0) {
					check = check_omok(i, j, arr[i][j]);
					if (check == true) {
						System.out.println(arr[i][j]);
						System.out.print((i+1) + " ");
						System.out.println((j+1));
						break out;
					}
				}
			}
		}
		if (check == false)
			System.out.println(0);

	}

	private static boolean check_omok(int x, int y, int value) {
		for (int i = 0; i < 4; i++) {
			int cnt = 1;
			int new_x = x, new_y = y;
			for (int j = 0; j < 4; j++) {
				new_x = new_x + dx[i];
				new_y = new_y + dy[i];
				if (inRange(new_x, new_y) && arr[new_x][new_y] == value)
					cnt += 1;
				else
					break;
			}
			if (cnt == 5) {
				
				if (inRange(new_x + dx[i], new_y + dy[i]) && inRange(x - dx[i], y - dy[i])) {
					if ((arr[new_x + dx[i]][new_y + dy[i]] != value) && (arr[x - dx[i]][y - dy[i]] != value))
						return true;
					else
						continue;
				}
			}
		}
		return false;
	}

	public static boolean inRange(int x, int y) {
		return x >= 0 && y >= 0 && x < 19 && y < 19;
	}

}
