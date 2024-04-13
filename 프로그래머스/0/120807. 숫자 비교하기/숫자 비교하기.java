class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        int min = 0;
        int max = 10000;
        
        
        if (min <= num1 && num1 <= max && min <= num2 && num2 <= max) {
            return num1 == num2 ? 1 : -1;
        }
        return answer;
    }
}