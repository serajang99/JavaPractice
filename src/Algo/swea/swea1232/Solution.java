package Algo.swea.swea1232;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static class Node {
		int value; // 노드값
		char opr; // 노드 연산자
		int left, right; // 자식 노드번호

		public Node(int value, char opr, int left, int right) {
			super();
			this.value = value;
			this.opr = opr;
			this.left = left;
			this.right = right;
		}

		public Node(int value) {
			this.value = value;
		}
	}

	static int N;
	static int result;
	static Node[] nodes;

	private static int calc(Node node) {
		char opr = node.opr;
		if (opr == '-') {
			return calc(nodes[node.left]) - calc(nodes[node.right]);
		} else if (opr == '+') {
			return calc(nodes[node.left]) + calc(nodes[node.right]);
		} else if (opr == '*') {
			return calc(nodes[node.left]) * calc(nodes[node.right]);
		} else if (opr == '/') {
			return calc(nodes[node.left]) / calc(nodes[node.right]);
		}
		return node.value;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			nodes = new Node[n + 1];

			for (int i = 1; i <= n; i++) {
				st = new StringTokenizer(br.readLine());
				int value = Integer.parseInt(st.nextToken());
				String opr = st.nextToken();

				int left = -1, right = -1;
				if (st.hasMoreTokens()) {
					left = Integer.parseInt(st.nextToken());
					right = Integer.parseInt(st.nextToken());
					nodes[i] = new Node(value, opr.charAt(0), left, right);
				} else {
					nodes[i] = new Node(Integer.parseInt(opr));
				}
			}

			int ans = calc(nodes[1]);
			System.out.println("#" + test_case + " " + ans);

		}
	}
}
