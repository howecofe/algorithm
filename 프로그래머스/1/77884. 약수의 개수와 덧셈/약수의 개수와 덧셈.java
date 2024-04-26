class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
//         for (int i = left; i <= right; i++) {
//             int cnt = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) { cnt++; }
//             }
            
//             answer += i * (cnt % 2 == 0 ? 1 : -1);
//         }
        
        for (int i = left; i <= right; i++) {
            // 제곱수로 나누어 떨어지면 약수 개수 홀수, 나누어 떨어지지 않으면 약수 개수 짝수
            answer += i * (i % Math.sqrt(i) == 0 ? -1 : 1);
        }
        
        return answer;
    }
}