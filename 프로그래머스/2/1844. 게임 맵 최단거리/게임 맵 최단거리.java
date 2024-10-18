import java.util.*;

class Solution {
    static int n, m, answer;
    static int[] dy = {1, 0, -1, 0}; // 하 우 상 좌
    static int[] dx = {0, 1, 0, -1};
    static Queue<Node> q = new LinkedList<>();
    
    static class Node {
        int y, x, c;
        
        Node(int y, int x, int c) {
            this.y = y;
            this.x = x;
            this.c = c;
        }
    }
    
    public int solution(int[][] maps) {
        answer = -1;
        n = maps.length - 1;
        m = maps[0].length - 1;
        
        bfs(maps);
        
        return answer;
    }
    
    static void bfs(int[][] maps) {
        q.offer(new Node(0, 0, 1));
        maps[0][0] = 0;
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            
            for (int d = 0; d < 4; d++) {
                int ny = node.y + dy[d];
                int nx = node.x + dx[d];
                int nc = node.c + 1;
                
                if (ny < 0 || nx < 0 || ny > n || nx > m || maps[ny][nx] == 0) continue;
                
                if (ny == n && nx == m) {
                    answer = nc;
                    return;
                }
                
                q.offer(new Node(ny, nx, nc));
                maps[ny][nx] = 0;
            }
        }
    }

}