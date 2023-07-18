import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int test_case = 1; test_case <= 10; test_case++) {
			int ans = 1;
			st = new StringTokenizer(br.readLine());
			int nodes = Integer.parseInt(st.nextToken());

			for (int i = 0; i < nodes; i++) {
				st = new StringTokenizer(br.readLine());
				int key = Integer.parseInt(st.nextToken());
				String node = st.nextToken();

				int left = -1, right = -1;
				if (st.hasMoreTokens()) {
					left = Integer.parseInt(st.nextToken());
				}

				if (st.hasMoreTokens()) {
					right = Integer.parseInt(st.nextToken());
				}

				if (left != -1 && right != -1) {
					if (node.equals("+") | node.equals("-") | node.equals("*") | node.equals("/")) {
						continue;
					} else {
						ans = 0;
					}
				} else if (left == -1 && right == -1) {
					if (node.equals("+") | node.equals("-") | node.equals("*") | node.equals("/")) {
						ans = 0;
					}
				} else {
					ans = 0;
				}
			}
			System.out.println("#" + test_case + " " + ans);

		}
	}
}
