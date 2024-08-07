class Solution {
    static int[][] arr;
    static int ans;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = computers[i].clone();
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans++;
                dfs(i);
            }
        }
        return ans;
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[node][i] == 0 || visited[i]) continue;

            dfs(i);
        }
    }
    
}