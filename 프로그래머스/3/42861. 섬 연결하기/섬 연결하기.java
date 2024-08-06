import java.util.*;

class Solution {
    static int N, res;
    static List<List<Node>> list = new ArrayList<>(); // 인접리스트
    static boolean[] visited;
    static Queue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.c - o2.c);

    static class Node {
        int v, c;
        Node(int v, int c) {
            this.v = v;
            this.c = c;
        }
    }

    public int solution(int n, int[][] costs) {
        N = n;
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }

        // 인접리스트 입력
        for (int i = 0; i < costs.length; i++) {
            int y = costs[i][0];
            int x = costs[i][1];
            int c = costs[i][2];

            list.get(y).add(new Node(x, c));
            list.get(x).add(new Node(y, c));
        }
        
        pq.offer(new Node(0, 0));
        bfs();

        return res;
    }

    static void bfs() {
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (visited[node.v]) continue;

            visited[node.v] = true;
            res += node.c;

            for (Node n : list.get(node.v)) {
                if (visited[n.v]) continue;
                pq.offer(new Node(n.v, n.c));
            }
        }
    }
}