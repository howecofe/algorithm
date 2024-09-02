import java.io.*;

class Main {
    static int Y, X, time, cheeseCnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] tmp = br.readLine().split(" ");
        Y = Integer.parseInt(tmp[0]);
        X = Integer.parseInt(tmp[1]);
        graph = new int[Y][X];

        // 풀이
        for (int i = 0; i < Y; i++) {
            tmp = br.readLine().split(" ");
            for (int j = 0; j < X; j++) {
                graph[i][j] = Integer.parseInt(tmp[j]);
                if (graph[i][j] == 1) cheeseCnt++;
            }
        }

        while (true) {
            visited = new boolean[Y][X];
            int cnt = dfs(0, 0);
            time++;
            
            if (cheeseCnt - cnt == 0) {
                break;
            }

            cheeseCnt -= cnt;
        }

        // 출력
        bw.write(time + "\n" + cheeseCnt);

        br.close();
        bw.flush();
        bw.close();
    }

    static int dfs(int y, int x) {
        int cheese = 0;
        visited[y][x] = true;

        for (int d = 0; d < 4; d++) {
            int newY = y + dy[d];
            int newX = x + dx[d];

            if (newY < 0 || newY >= Y || newX < 0 || newX >= X || visited[newY][newX]) continue;

            if (graph[newY][newX] == 1) {
                visited[newY][newX] = true;
                graph[newY][newX] = 0;
                cheese++;
            } else {
                cheese += dfs(newY, newX);
            }
        }

        return cheese;
    }
    
}