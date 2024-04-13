class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (0 < n && n <= 1000) {
            for (int i = 2; i <= n; i += 2) {
                answer += i;
            }
        }
        
        return answer;
    }
}