import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static int N, M, ans, totalTomato;
    static int[][] box;
    static Queue<Point> q = new LinkedList<>();
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    static class Point {
        int y, x, c;

        public Point(int y, int x, int c) {
            this.y = y;
            this.x = x;
            this.c = c;
        }
    }

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[1]);
        M = Integer.parseInt(input[0]);
        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                int n = Integer.parseInt(input[j]);
                box[i][j] = n;
                if (n == 0) totalTomato++;
            }
        }

        // 풀이
        if (totalTomato == 0) {
            bw.write(0 + "");
        } else {

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[i][j] == 1) {
                        q.offer(new Point(i, j, 0));
                    }
                }
            }

            bfs();

            if (totalTomato > 0) {
                bw.write(-1 + "");
            } else {
                bw.write(ans + "");
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs() {

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int d = 0; d < 4; d++) {
                int ny = p.y + dy[d];
                int nx = p.x + dx[d];
                int nc = p.c + 1;

                if (ny < 0 || ny >= N || nx < 0 || nx >= M || box[ny][nx] != 0) continue;

                totalTomato--;
                ans = Math.max(ans, nc);
                box[ny][nx] = 1;
                q.offer(new Point(ny, nx, nc));
            }
        }
    }

}