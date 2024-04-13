class Solution {
    
    // 최대공약수
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        else return GCD(num2, num1 % num2);
    }
    
    // 최소공배수
    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }
    
    public int solution(int n) {
        return LCM(n, 6) / 6;
    }
}