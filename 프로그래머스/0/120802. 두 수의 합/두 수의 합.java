class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        int max = 50000;
        int min = -50000;
        
        if (min <= num1 && num1 <= max && min <= num2 && num2 <= max) {
            return num1 + num2;
        }
        return answer;
    }
}