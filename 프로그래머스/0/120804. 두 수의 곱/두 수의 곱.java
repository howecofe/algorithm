class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        int min = 0;
        int max = 100;
        
        if (min <= num1 && num2 <= max && min <= num2 && num2 <= max) {
            return num1 * num2;
        }
        
        return answer;
    }
}