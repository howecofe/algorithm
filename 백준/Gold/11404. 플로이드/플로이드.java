import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {

    static int n, m;
    static long[][] matrix;
    static final int INF = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        matrix = new long[n + 1][n + 1];

        // 인접행렬 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) matrix[i][j] = 0;
                else matrix[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            matrix[v1][v2] = Math.min(matrix[v1][v2], c);
        }

        // 풀이: 플로이드 워셜
        for (int k = 1; k <= n; k++) { // k: 경유지
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

        // 출력
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i][j] >= INF) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(matrix[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}