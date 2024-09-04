import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    static int totalCnt, ans;
    static int H, N, M;
    static int[][][] map;
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0, 0, 0};
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static Queue<Point> q = new LinkedList<>();

    static class Point {
        int z, y, x, c;

        public Point(int z, int y, int x, int c) {
            this.z = z;
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
        H = Integer.parseInt(input[2]);
        N = Integer.parseInt(input[1]);
        M = Integer.parseInt(input[0]);
        map = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                input = br.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    int n = Integer.parseInt(input[k]);
                    map[i][j][k] = n;
                    if (n == 0) totalCnt++;
                    if (n == 1) q.offer(new Point(i, j, k, 0));
                }
            }
        }

        // 풀이
        if (totalCnt == 0) {
            bw.write(0 + "");
            bw.flush();
            return;
        }

        bfs();

        if (totalCnt > 0) ans = -1;

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void bfs() {
        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int d = 0; d < 6; d++) {
                int newZ = p.z + dz[d];
                int newY = p.y + dy[d];
                int newX = p.x + dx[d];
                int newC = p.c + 1;

                if (newZ < 0 || newZ >= H || newY < 0 || newY >= N || newX < 0 || newX >= M || map[newZ][newY][newX] != 0) continue;

                map[newZ][newY][newX] = 1;
                totalCnt--;
                ans = Math.max(ans, newC);
                q.offer(new Point(newZ, newY, newX, newC));
            }
        }
    }

}