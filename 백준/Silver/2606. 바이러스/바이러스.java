import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int com, net, result;
    static boolean[] visit;
    static List<List<Integer>> adjList = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        // 입력
        com = Integer.parseInt(br.readLine());
        net = Integer.parseInt(br.readLine());

        // 풀이 (인접리스트 이용)
        // adjList 객체 할당
        visit = new boolean[com + 1]; // idx 0 : dummy
        for (int i = 0; i < com + 1; i++) { // idx 0 : dummy
            adjList.add(new ArrayList<>());
        }

        // adjList 각 객체에 값 할당
        for (int i = 0; i < net; i++) {
            st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());

            adjList.get(com1).add(com2);
            adjList.get(com2).add(com1);
        }

        dfs(1); // 1번 노드부터 탐색 시작
        result--; // 시작 노드 카운트 제외

        // 출력
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int v) {
        // 방문 처리
        visit[v] = true;

        // 필요한 처리 수행
        result++;

        // 인접 노드 방문 이어가기
        for (Integer i : adjList.get(v)) {
            // 방문한 상태면 continue
            if (visit[i]) continue;

            // 그게 아니면 방문을 위해 재귀호출
            dfs(i);
        }
    }

}