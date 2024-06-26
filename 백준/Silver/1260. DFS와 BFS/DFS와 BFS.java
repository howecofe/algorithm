import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, M, V;
    static boolean[][] matrix;
    static boolean[] visit;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 풀이 (인접행렬 이용)
        matrix = new boolean[N + 1][N + 1]; // idx 0 : dummy
        visit = new boolean[N + 1]; // idx 0 : dummy

        // 양방향 간선 표시
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            matrix[n1][n2] = true;
            matrix[n2][n1] = true;
        }

        // 출력
        dfs(V);
        bw.write("\n");
        visit = new boolean[N + 1]; // 초기화
        bfs(V);

        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs(int v) throws Exception {
        // 자료구조 큐
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(v); // 시작 노드 넣기
        visit[v] = true; // 방문 처리

        // 큐 empty 될 때까지 반복
        while (!q.isEmpty()) {
            int n = q.poll(); // 노드 꺼내기

            // 방문한 노드 출력
            bw.write(n + " ");

            // 방문
            for (int i = 1; i <= N; i++) {
                // 간선이 없거나, 이미 방문했으면 continue
                if (!matrix[n][i] || visit[i]) continue;

                // 그게 아니면 해당 노드 방문 처리
                q.offer(i);
                visit[i] = true;
            }
        }

    }

    static void dfs(int v) throws Exception {
        // 방문 처리
        visit[v] = true;

        // 방문한 노드 출력
        bw.write(v + " ");

        // 방문
        for (int i = 1; i <= N; i++) {
            if (!matrix[v][i] || visit[i]) continue;

            // v와 연결된 노드 방문하기 위해 재귀호출
            dfs(i);
        }
    }
}