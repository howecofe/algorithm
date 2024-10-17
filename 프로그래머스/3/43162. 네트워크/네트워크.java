class Solution {
    static int answer, N;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        N = n;
        visited = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            answer++;
            dfs(i, computers);
        }
        
        return answer;
    }
    
    static void dfs(int node, int[][] map) {
        visited[node] = true;
        
        for (int i = 0; i < N; i++) {
            if (visited[i] || map[node][i] == 0) continue;
            
            dfs(i, map);
        }
    }
    
}