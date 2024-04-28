class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (j == Math.sqrt(i)) { cnt++; } // 제곱근으로 나누어 떨어지면 +1 카운트
                else if (i % j == 0) { cnt += 2; } // 제곱근이 아닌 수로 나누어 떨어지면 +2 카운트
            }
            answer += cnt > limit ? power : cnt;
        }
        
        return answer;
    }
}