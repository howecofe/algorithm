import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int N;
    static int min = Integer.MAX_VALUE;
    static boolean[] visit;
    static int[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 풀이
        for (int i = 0; i < N; i++) {
            visit[i] = true;
            dfs(i, i, 0, 0);
            visit[i] = false;
        }

        // 출력
        bw.write(min + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int start, int curr, int dist, int cnt) {
        // 기저 조건
        if (cnt == N - 1) { // 첫노드 방문 카운트 빼기
            if (map[curr][start] != 0) {
                min = Math.min(min, dist + map[curr][start]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (visit[i] || map[curr][i] == 0) continue;

            visit[i] = true;
            dfs(start, i, dist + map[curr][i], cnt + 1);
            visit[i] = false;
        }
    }
}