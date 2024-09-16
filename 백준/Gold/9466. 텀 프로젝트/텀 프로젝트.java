import java.io.*;

class Main {
    static int T, n, cnt;
    static boolean[] visited;
    static boolean[] finished;
    static int[] arr;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 입력
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            cnt = 0;
            String[] input = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                arr[j + 1] = Integer.parseInt(input[j]);
            }

            // 풀이
            for (int j = 1; j <= n; j++) {
                if (!finished[j]) dfs(j);
            }

            // 출력
            bw.write(n - cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int now) {
        if (finished[now]) return;

        // 이미 방문한 적 있는 노드는 사이클 그룹에 있는 노드
        if (visited[now]) {
            cnt++;
            finished[now] = true; // 탐색 종료 표시
        }

        visited[now] = true;
        dfs(arr[now]);
        finished[now] = true;
    }

}