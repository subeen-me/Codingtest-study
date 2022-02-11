package Algorithm.Array;

import java.util.Scanner;

public class 봉우리 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boolean flag = true;
                for(int k = 0; k<4; k++){ //k는 네 방향 탐색
                    int nx = i + dx[k]; //nx는 행 좌표
                    int ny = j + dy[k]; //ny는 열 좌표
                    if( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        봉우리 T = new 봉우리();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
