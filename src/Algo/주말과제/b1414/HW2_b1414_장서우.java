package Algo.주말과제.b1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HW2_b1414_장서우 {

	static class edge { // edge 클래스
		int a; // 컴퓨터 노드1
		int b; // 컴퓨터 노드2
		int weight; // 랜선 길이

		public edge(int a, int b, int weight) { // 생성자
			super();
			this.a = a;
			this.b = b;
			this.weight = weight;
		}
	}

	static int N; // 컴퓨터의 개수
	static int[][] lan; // 각각의 컴퓨터를 연결하는 랜선(인덱스는 컴퓨터 번호)
	static int[] parent; // 각 컴퓨터 노드의 부모
	static int sum; // 다솜이 가지고 있는 총 랜선의 길이
	static ArrayList<edge> edges;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력을 위한 BufferedReader 사용
		N = Integer.parseInt(br.readLine()); // 컴퓨터의 개수 입력
		lan = new int[N + 1][N + 1]; // lan 배열 생성
		sum = 0; // 총 길이 초기화
		edges = new ArrayList<edge>(); // edges 배열 생성
		for (int i = 1; i <= N; i++) {
			String s = br.readLine(); // 한줄 읽기
			for (int j = 1; j <= N; j++) {
				char c = s.charAt(j - 1); // 문자열 s에서 한글자씩 c에 저장
				if (c >= 'a' && c <= 'z') // c가 a~z 사이에 있을 경우 랜선의 길이는 1부터 26
					lan[i][j] = c - 'a' + 1;
				else if (c >= 'A' && c <= 'Z') // c가 A~Z 사이에 있을 경우 랜선의 길이는 1부터 26
					lan[i][j] = c - 'A' + 27;
				if (lan[i][j] != 0) { // lan 배열에 값이 있을 경우
					sum += lan[i][j]; // 총 길이에 더하기
					edges.add(new edge(i, j, lan[i][j])); // edges 배열에 추가
				}
			}
		}
		edges.sort((o1, o2) -> o1.weight - o2.weight); // edges 배열 lan 길이 오름차순으로 정렬

		parent = new int[N + 1]; // parent 배열 생성
		for (int i = 1; i <= N; i++) { // parent 배열 각 인덱스 값으로 초기화(자기 자신이 부모)
			parent[i] = i;
		}

		int result = 0; // 사용한 edge의 가중치의 합
		int useEdge = 0; // 사용한 edge 개수
		for (edge edge : edges) { 
			if (find(edge.a) != find(edge.b)) { // 같은 집합의 원소인지 확인 -> 아닐 경우
				union(edge.a, edge.b); // 같은 집합으로 연결
				result += edge.weight; // 가중치 더하기
				useEdge++; // 사용한 edge 개수 1 늘리기
			}
			if (useEdge > edges.size()) // 모든 edge를 다 사용하였으면 빠져나오기
				break;
		}

		int flag = 0; // 다 연결되었는지 확인하기 위한 flag
		for (int i = 2; i <= N; i++) {
			if (find(parent[i]) != find(parent[1])) { // 같은 집합의 원소인지 확인 -> 아닐 경우
				flag = 1; // 서로 다른 집합 존재 -> 연결 안됨
				break;
			}
		}
		if (flag == 1) // 연결 안된 경우
			System.out.println(-1); // -1 출력
		else // 연결 된 경우
			System.out.println(sum - result); // 가지고 있던 총 랜선 길이에서 사용한 랜선 길이만큼 빼고 기부
	}

	private static int find(int child) { // find 연산: child의 대표 노드를 찾아서 반환
		if (parent[child] != child) // child의 부모가 child와 같지 않을 경우
			return parent[child] = find(parent[child]); // 재귀로 다시 child의 제일 상단의 부모, 즉 대표노드를 찾아서 child의 부모값으로 설정 후 반환
		else // child가 부모일 경우
			return child;
	}

	private static void union(int a, int b) { // union 연산: 대표 노드끼리 연결하기
		if (parent[a] != parent[b]) { // a와 b의 parent가 같은 경우는 이미 union이므로 연산 X
			int fa = find(a); // a의 대표노드
			int fb = find(b); // b의 대표노드
			if (fa < fb) { // b의 대표노드가 더 클 경우
				parent[fb] = fa; // b의 대표노드의 부모값을 a의 대표노드로 설정하여 union 해준다.
			} else { // a의 대표노드가 더 클 경우
				parent[fa] = fb; // a의 대표노드의 부모값을 b의 대표노드로 설정하여 union 해준다.
			}
		}
	}
}
