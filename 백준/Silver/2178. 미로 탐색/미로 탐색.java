import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


class Main {
    static int N, M, ans;
    static int[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static Queue<Point> q = new LinkedList<>();
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
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new int[N + 1][M + 1]; // 0 dummy

        for (int i = 1; i <= N; i++) {
            input = br.readLine().split("");
            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(input[j - 1]);
            }
        }

        // 풀이
        bfs();

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs() {
        map[1][1] = 0;
        q.offer(new Point(1, 1, 1));
        boolean finished = false;

        while (!q.isEmpty() && !finished) {
            Point p = q.poll();

            for (int d = 0; d < 4; d++) {
                int newY = p.y + dy[d];
                int newX = p.x + dx[d];
                int newC = p.c + 1;

                if (newY < 1 || newY > N || newX < 1 || newX > M || map[newY][newX] == 0) continue;

                if (newY == N && newX == M) {
                    ans = newC;
                    finished = true;
                    break;
                }

                map[newY][newX] = 0;
                q.offer(new Point(newY, newX, newC));
            }
        }
    }
}