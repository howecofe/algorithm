class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken / 10 > 0) {
            answer += chicken / 10; // 서비스 치킨 수
            chicken = chicken % 10 + chicken / 10; // 남은 쿠폰 수
        }
        
        return answer;
    }
}