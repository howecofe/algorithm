import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    static int N, M, ans;
    static int[][][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static Queue<Point> q = new LinkedList();

    static class Point {
        int y, x, c;
        boolean breakWall;

        public Point(int y, int x, int c, boolean breakWall) {
            this.y = y;
            this.x = x;
            this.c = c;
            this.breakWall = breakWall;
        }
    }

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new int[2][N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            input = br.readLine().split("");
            for (int j = 1; j <= M; j++) {
                int n = Integer.parseInt(input[j - 1]);
                map[0][i][j] = n;
                map[1][i][j] = n;
            }
        }

        // 풀이
        ans = Integer.MAX_VALUE;
        bfs();

        if (ans == Integer.MAX_VALUE) ans = -1;

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs() {
        q.offer(new Point(1, 1, 1, false));

        while (!q.isEmpty()) {
            Point p = q.poll();

            if (p.y == N && p.x == M) {
                ans = Math.min(ans, p.c);
            }

            for (int d = 0; d < 4; d++) {
                int ny = p.y + dy[d];
                int nx = p.x + dx[d];
                int nc = p.c + 1;

                if (ny <= 0 || ny > N || nx <= 0 || nx > M) continue;

                if (!p.breakWall && map[0][ny][nx] == 0) {
                    map[0][ny][nx] = 1;
                    q.offer(new Point(ny, nx, nc, false));
                } else if (!p.breakWall && map[0][ny][nx] == 1) {
                    map[1][ny][nx] = 1;
                    q.offer(new Point(ny, nx, nc, true));
                } else if (p.breakWall && map[1][ny][nx] == 0) {
                    map[1][ny][nx] = 1;
                    q.offer(new Point(ny, nx, nc, true));
                }
            }
        }
    }

}