class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        int min = 0;
        int max = 100;
        
        if (min < num1 && num1 <= 100 && min < num2 && num2 <= max) {
            answer = (int)(((double)num1 / num2) * 1000);
        }
        
        return answer;
    }
}