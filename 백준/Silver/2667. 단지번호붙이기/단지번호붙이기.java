import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {

    static int N, cnt;
    static List<Integer> list = new ArrayList<>();
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static char[][] graph;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        graph = new char[N][];

        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine().toCharArray();
        }

        // 풀이
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == '1') {
                    cnt = 0; // 단지 내 집의 수 초기화
                    dfs(i, j);
                    list.add(cnt); // 단지 내 집의 수 추가
                }
            }
        }

        // 출력
        bw.write(list.size() + "\n");
        list.sort(Comparator.naturalOrder());
        for (int n : list) bw.write(n + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int y, int x) {
        // 해당 노드 방문 처리
        graph[y][x] = '0';

        // 단지 내 집의 수 카운트
        cnt++;

        // 상하좌우 방문
        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            // 경계값 검사 및 집의 여부 체크
            if (ny < 0 || nx < 0 || ny >= N || nx >= N || graph[ny][nx] != '1') continue;

            dfs(ny, nx);
        }
    }

}