class Solution {
    static int ans, tgt;
    static int[] arr;
    
    public int solution(int[] numbers, int target) {
        arr = numbers.clone();
        tgt = target;

        dfs(0, 0);

        return ans;
    }

    static void dfs(int sum, int depth) {
        if (depth == arr.length) {
            if (sum == tgt) ans++;
            return;
        }

        dfs(sum + arr[depth], depth + 1);
        dfs(sum - arr[depth], depth + 1);
    }
}