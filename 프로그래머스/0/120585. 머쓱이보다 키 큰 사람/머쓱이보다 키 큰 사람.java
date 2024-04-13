class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        if (1 <= array.length && array.length <= 100 && 1 <= height && height <= 200) {
            for (int num : array) {
                if (1 <= num && num <= 200) {
                    if (height < num) answer++;
                }
            }
        }
        
        return answer;
    }
}