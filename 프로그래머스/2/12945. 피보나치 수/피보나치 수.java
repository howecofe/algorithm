class Solution {
    public int solution(int n) {
        int n1 = 0, n2 = 1;
        int n3 = 0;

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2 % 1234567;
            n2 = n3 % 1234567;
        }
        
        return n3 % 1234567;
    }
    
    // private int fibonacci(int n) {
    //     if (n == 0) { return 0; }
    //     else if (n == 1) { return 1; }
    //     else {
    //         return fibonacci(n - 2) + fibonacci(n - 1);
    //     }
    // }
}