class Solution {
    public long solution(int n) {
        long n1 = 1;
        long n2 = 2;
        long ans = 0;
        
        if (n == 1) { ans = n1; }
        else if (n == 2) { ans = n2; }
        else {
            for (int i = 3; i <= n; i++) {
                ans = (n1 + n2) % 1234567;
                n1 = n2;
                n2 = ans;
            }
        }
        
        return ans;
    }
}