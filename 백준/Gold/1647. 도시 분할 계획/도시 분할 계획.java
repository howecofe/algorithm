import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 최소신장트리 - 크루스칼 알고리즘
class Main {
    static int N, M, result;
    static Edge[] edges;
    static int[] parent;
    static class Edge {
        int v1, v2, c;
        Edge(int v1, int v2, int c) {
            this.v1 = v1;
            this.v2 = v2;
            this.c = c;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점
        // 마을이 2개(N == 2)인 경우: 비용 0
        if (N != 2) {
            M = Integer.parseInt(st.nextToken()); // 간선
            parent = new int[N + 1]; // 0 : dummy
            edges = new Edge[M];

            // 간선 배열 초기화
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                edges[i] = new Edge(a, b, c);
            }

            // 풀이: 최소 신장 트리 - 크루스칼
            // 정점의 루트노드 초기화
            makeSet();

            // 간선 오름차순 정렬
            Arrays.sort(edges, (e1, e2) -> e1.c - e2.c);

            // cycle 확인 후 union
            int cnt = 0;
            for (Edge edge : edges) {
                if (union(edge.v1, edge.v2)) {
                    result += edge.c;
                    cnt++;
                }

                // 두 마을이어야 하므로 (정점 - 1) 연결 여부 확인
                // N - 1: 모든 정점 연결
                // N - 2: 가중치가 가장 큰 마을 하나 제외하고 연결 -> 두 마을이 된다!
                if (cnt == N - 2) break;
            }
        }

        // 출력
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void makeSet() {
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
    }

    static int findSet(int v) {
        if (parent[v] == v) return v;
        return parent[v] = findSet(parent[v]);
    }

    static boolean union(int x, int y) {
        int px = findSet(x);
        int py = findSet(y);

        // cycle 확인 (루트노드 같은지 확인)
        if (px == py) return false;

        // 작은 값으로 합친다.
        if (px < py) parent[py] = px;
        else parent[px] = py;

        return true;
    }
}