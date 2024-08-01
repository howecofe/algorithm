import java.util.*;

class Solution {
    static int min = 100;
    static int cnt;
    
    public int solution(int n, int[][] wires) {
        int[][] map = new int[n + 1][n + 1]; // 0: dummy

        for (int[] w : wires) {
            map[w[0]][w[1]] = 1;
            map[w[1]][w[0]] = 1;
        }

        // 연결을 하나씩 끊어보면서 개수 차이 구하기
        for (int[] w : wires) {
            // 배열 복사
            int[][] copied = new int[map.length][map.length];
            for (int i = 0; i < copied.length; i++){
                copied[i] = Arrays.copyOf(map[i], map[i].length);
            }

            // 연결 끊기
            copied[w[0]][w[1]] = 0;
            copied[w[1]][w[0]] = 0;

            cnt = 1; // 송전탑 개수 초기화

            // 1번 탑에 연결된 모든 송전탑 찾기
            dfs(copied, 1);

            // 최솟값 갱신
            min = Math.min(min, Math.abs(cnt - (n - cnt)));
        }

        return min;
    }

    static void dfs(int[][] map, int node) {
        for (int i = 1; i < map.length; i++) { // 0: dummy 제외
            // 연결여부 및 방문가능여부 체크
            if (map[node][i] == 0) continue;

            // 방문 처리
            map[node][i] = 0;
            map[i][node] = 0;
            cnt++; // 연결된 송전탑 수 증가
            dfs(map, i);
        }
    }
}