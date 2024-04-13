class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        if (0 <= array.length && array.length <= 100 && 0 <= n && n <= 1000) {
            for (int num : array) {
                if (0 <= num && num <= 1000) {
                    if (n == num) answer++;
                }
            }
        }
        
        return answer;
    }
}