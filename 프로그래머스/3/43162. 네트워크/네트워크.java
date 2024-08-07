class Solution {
    static int[][] arr;
    static int ans;
    static boolean finished;
    
    public int solution(int n, int[][] computers) {
        arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = computers[i].clone();
        }

        for (int i = 0; i < n; i++) {
            finished = true;

            dfs(i);

            if (!finished) ans++;
        }
        return ans;
    }

    static void dfs(int node) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[node][i] == 0) continue;

            finished = false;
            arr[node][i] = 0;
            arr[i][node] = 0;
            dfs(i);
        }
    }
    
}