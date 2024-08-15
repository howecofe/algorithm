import java.util.*;

class Solution {
    static Map<Integer, Integer> costMap = new HashMap<>(); // 거리 : 개수 저장 맵
    static List<List<Integer>> list = new ArrayList<>(); // 인접리스트
    static boolean[] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int maxDist;
    
    public int solution(int n, int[][] edge) {
        visited = new boolean[n + 1]; // 0: dummy
        for (int i = 0; i <= n; i++) list.add(new ArrayList<>()); // 0: dummy

        // 양방향 간선 표시
        for (int[] e : edge) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }

        bfs();

        return costMap.get(maxDist);
    }

    static void bfs() {
        // 1번 노드 넣고 방문 처리
        q.offer(new int[]{1, 0}); // node, cost
        visited[1] = true;

        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int node = tmp[0];
            int cost = tmp[1];

            maxDist = cost; // 최장 거리 갱신
            costMap.put(cost, costMap.getOrDefault(cost, 0) + 1); // 카운트 저장

            for (int n : list.get(node)) {
                if (visited[n]) continue;

                q.offer(new int[]{n, cost + 1});
                visited[n] = true;
            }
        }
    }
}