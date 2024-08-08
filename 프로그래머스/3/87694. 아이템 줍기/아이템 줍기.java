import java.util.*;

class Solution {
    // 1. BFS
//     static int min;
//     static int[] dy = {1, -1, 0, 0};
//     static int[] dx = {0, 0, -1, 1};
//     static Queue<Point> q = new LinkedList<>();
//     static boolean[][] map;
    
//     static class Point {
//         int y, x, c;
//         Point(int y, int x, int c) {
//             this.y = y;
//             this.x = x;
//             this.c = c;
//         }
//     }
    
//     public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
//         // 2배 크기 map 구성 (테두리 1, 나머지 0)
//         map = new boolean[101][101]; // 50 * 2

//         // 직사각형 테두리 & 내부 true로 채우기
//         for (int[] rect : rectangle) {
//             for (int i = rect[1] * 2; i <= rect[3] * 2; i++) {
//                 for (int j = rect[0] * 2; j <= rect[2] * 2; j++) {
//                     map[i][j] = true;
//                 }
//             }
//         }

//         // 직사각형 테두리 제외한 내부만 false로 채우기
//         for (int[] rect : rectangle) {
//             for (int i = rect[1] * 2 + 1; i < rect[3] * 2; i++) {
//                 for (int j = rect[0] * 2 + 1; j < rect[2] * 2; j++) {
//                     map[i][j] = false;
//                 }
//             }
//         }

//         // 시작 좌표 방문
//         q.offer(new Point(characterY * 2, characterX * 2, 0));
//         map[characterY * 2][characterX * 2] = false; // 방문 처리

//         bfs(itemY * 2, itemX * 2);

//         return min / 2;
//     }

//     static void bfs(int tgtY, int tgtX) {
//         while (!q.isEmpty()) {
//             Point point = q.poll();

//             for (int d = 0; d < 4; d++) {
//                 int newY = point.y + dy[d];
//                 int newX = point.x + dx[d];
//                 int cost = point.c + 1;

//                 if (newY < 1 || newY > 100 || newX < 1 || newX > 100 || !map[newY][newX]) continue;

//                 if (newY == tgtY && newX == tgtX) {
//                     min = cost;
//                     return;
//                 }

//                 q.offer(new Point(newY, newX, cost));
//                 map[newY][newX] = false;
//             }
//         }
//     }
    
    // 2. DFS
    static int min = Integer.MAX_VALUE;
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static boolean[][] map;
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        // 2배 크기 map 구성 (테두리 1, 나머지 0)
        map = new boolean[101][101]; // 50 * 2

        // 직사각형 테두리 & 내부 true로 채우기
        for (int[] rect : rectangle) {
            for (int i = rect[1] * 2; i <= rect[3] * 2; i++) {
                for (int j = rect[0] * 2; j <= rect[2] * 2; j++) {
                    map[i][j] = true;
                }
            }
        }

        // 직사각형 테두리 제외한 내부만 false로 채우기
        for (int[] rect : rectangle) {
            for (int i = rect[1] * 2 + 1; i < rect[3] * 2; i++) {
                for (int j = rect[0] * 2 + 1; j < rect[2] * 2; j++) {
                    map[i][j] = false;
                }
            }
        }

        // 시작 좌표 방문
        dfs(itemY * 2, itemX * 2, characterY * 2, characterX * 2, 0);

        return min / 2;
    }

    static void dfs(int tgtY, int tgtX, int y, int x, int cost) {

        for (int d = 0; d < 4; d++) {
            int newY = y + dy[d];
            int newX = x + dx[d];
            int newC = cost + 1;

            if (newY < 1 || newY > 100 || newX < 1 || newX > 100 || !map[newY][newX]) continue;

            // 아이템 지점에 도착했으면 거리 최솟값으로 갱신
            if (y == tgtY && x == tgtX && cost > 0) {
                min = Math.min(min, cost);
            }

            map[newY][newX] = false;
            dfs(tgtY, tgtX, newY, newX, newC);
            map[newY][newX] = true;
        }
    }
}