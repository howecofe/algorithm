import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {
    static int M, N, K;
    static List<Integer> widthList = new ArrayList<>();
    static int[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] arr = br.readLine().split(" ");
        M = Integer.parseInt(arr[0]);
        N = Integer.parseInt(arr[1]);
        K = Integer.parseInt(arr[2]);

        // 풀이
        map = new int[M][N];

        // 직사각형 위치 표시 : 1
        for (int i = 0; i < K; i++) {
            String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]);
            int y1 = Integer.parseInt(points[1]);
            int x2 = Integer.parseInt(points[2]);
            int y2 = Integer.parseInt(points[3]);

            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    int width = dfs(i, j);
                    widthList.add(width);
                }
            }
        }

        widthList.sort(Comparator.naturalOrder());

        // 출력
        bw.write(widthList.size() + "\n");
        for (int w : widthList) bw.write(w + " ");

        br.close();
        bw.flush();
        bw.close();
    }

    static int dfs(int y, int x) {
        int width = 1;
        map[y][x] = 1;

        for (int d = 0; d < 4; d++) {
            int newY = y + dy[d];
            int newX = x + dx[d];

            if (newY < 0 || newY >= M || newX < 0 || newX >= N || map[newY][newX] == 1) continue;

            width += dfs(newY, newX);

        }

        return width;
    }

}