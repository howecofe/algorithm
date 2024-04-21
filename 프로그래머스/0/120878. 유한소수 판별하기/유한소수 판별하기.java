class Solution {
    public int solution(int a, int b) {
        // 최대공약수 구하기
        int gcd = gcd(a, b);
        
        // 기약분수로 만든 분모의 소인수가 2, 5만 존재하는지 확인
        b /= gcd;
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) { b /= 2; }
            if (b % 5 == 0) { b /= 5; }
        }
                
        return b == 1? 1: 2;
    }
    
    int gcd(int a, int b) {
        if (b == 0) { return a; }
        return gcd(b, a % b);
    }
}