class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int mul = 1;
        
        while (true) {
            mul *= ++num;
            if (n < mul) break;
            else answer++;
        }
        
        return answer;
    }
}