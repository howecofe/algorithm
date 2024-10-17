class Solution {
    static int tgt, answer;
    static int[] nums;
    
    public int solution(int[] numbers, int target) {
        nums = numbers.clone();
        tgt = target;
        
        dfs(0, 0);
        
        return answer;
    }
    
    static void dfs(int depth, int sum) {
        if (depth == nums.length) {
            if (sum == tgt) answer++;
            return;
        }
        
        dfs(depth + 1, sum + nums[depth]);
        dfs(depth + 1, sum - nums[depth]);
    }

}