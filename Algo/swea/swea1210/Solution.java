package swea1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution  {
    static int[] dx = { 0, 0, -1 };
    static int[] dy = { -1, 1, 0 };
    static int[][] arr;
    //사다리 아래서 위로
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int targetX = 0, targetY = 0;//최종목적지 좌표(값이 2)->출발지좌표

        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = Integer.parseInt(br.readLine());//테케번호 1,2,3,4..10
            arr = new int[100][100];
            for (int i = 0; i < 100; i++) {//행번호 Y좌표
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {//열번호 X좌표
                    arr[i][j] = Integer.parseInt(st.nextToken());//가로로 채움
                    if (arr[i][j] == 2) {//목적지 값을 만나면 좌표저장
                        targetX = i;
                        targetY = j;
                    }
                }
            }
            int result = sadari(targetX, targetY);//목적지부터 거꾸로 검색
            System.out.println("#" + T + " " + result);
        }
    }

    public static int sadari(int x, int y) {//x:행, y:열
        int ans = 0;
        while (true) {
            if (x == 0) { //시작위치는 행번호가 0 
                ans = y;
                break;
            }
            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i]; //{ 0, 0, -1 }; 행( ,  , 상) 
                int ny = y + dy[i]; //{ -1, 1, 0 }; 열(좌, 우,  )
                if (inRange(nx, ny) && arr[nx][ny] == 1) {
                    //지나온 길 표시
                    arr[x][y] = 4;//지나온길을 확인할 용도.안해도됨
                    x = nx;//다음 방문할 행 좌표로 설정
                    y = ny;//다음 방문할 열 좌표로 설정
                }
            }
        }

        return ans;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && y >= 0 && x < 100 && y < 100;
    }

}