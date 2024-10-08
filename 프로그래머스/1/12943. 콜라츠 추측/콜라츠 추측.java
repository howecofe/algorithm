class Solution {
    public int solution(long num) {
        if (num == 1) { return 0; }
        
        int answer = 0;
        
        while (num > 1) {
            if (answer >= 500) { return -1;}
            
            answer++;
            if (num % 2 == 0) { num /= 2; }
            else { num = num * 3 + 1; }
        }
        
        return answer;
    }
}