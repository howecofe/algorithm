class Solution {
    static int[] nums;
    static int targetNum;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        nums = numbers;
        targetNum = target;
        
        dfs(0, 0);
        
        return answer;
    }
    
    private static void dfs(int sum, int depth) {
        if (depth == nums.length) {
            if (sum == targetNum) { answer++; }
            return;
        }

        dfs(sum + nums[depth], depth + 1);
        dfs(sum - nums[depth], depth + 1);
    }
}