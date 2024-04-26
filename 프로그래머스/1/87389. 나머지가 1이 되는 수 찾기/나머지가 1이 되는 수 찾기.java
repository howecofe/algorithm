class Solution {
    public int solution(int n) {
        int i = 0;
        int answer = 0;
        while (true) {
            i++;
            if (n % i == 1) { answer = i; break; }
        }
        return answer;
    }
}