import java.util.*;

class Solution {
    
    // 1. BFS (통과)
    static Queue<Node> q = new LinkedList<>();
    static int ans, n, m;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        n = maps.length - 1;
        m = maps[0].length - 1;
        ans = -1;

        bfs(maps);

        return ans;
    }

    static class Node {
        int y, x, c;
        Node(int y, int x, int c) {
            this.y = y;
            this.x = x;
            this.c = c;
        }
    }

    static void bfs(int[][] maps) {
        q.offer(new Node(0, 0, 1));
        maps[0][0] = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int d = 0; d < 4; d++) {
                int newY = node.y + dy[d];
                int newX = node.x + dx[d];
                int cost = node.c + 1;

                if (newY < 0 || newY > n || newX < 0 || newX > m || maps[newY][newX] == 0) continue;

                if (newY == n && newX == m) {
                    ans = cost;
                    return;
                }

                maps[newY][newX] = 0;
                q.offer(new Node(newY, newX, cost));
            }
        }
    }
    
    // 2. DFS (시간초과)
//     static int ans, n, m;
//     static int[] dy = {1, 0, -1, 0};
//     static int[] dx = {0, 1, 0, -1};
    
//     public int solution(int[][] maps) {
//         n = maps.length - 1;
//         m = maps[0].length - 1;
//         ans = Integer.MAX_VALUE;

//         maps[0][0] = 0;
//         dfs(maps, 0, 0, 1);

//         return ans == Integer.MAX_VALUE ? -1 : ans;
//     }

//     static void dfs(int[][] maps, int y, int x, int c) {
        
//         for (int d = 0; d < 4; d++) {
//             int newY = y + dy[d];
//             int newX = x + dx[d];
//             int newC = c + 1;

//             if (newY < 0 || newY > n || newX < 0 || newX > m || maps[newY][newX] == 0) continue;

//             if (newY == n && newX == m) {
//                 ans = Math.min(ans, newC);
//             }

//             maps[newY][newX] = 0;
//             dfs(maps, newY, newX, newC);
//             maps[newY][newX] = 1;
//         }
//     }

}