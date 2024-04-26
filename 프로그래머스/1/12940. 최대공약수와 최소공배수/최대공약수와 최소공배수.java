class Solution {
    public int[] solution(long n, long m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }
    
    private int gcd(long n, long m) {
        if (n % m == 0) {
            return (int) m;
        }
        return gcd(m, n % m);
    }
 
    private int lcm(long n, long m) {
        return (int) (n * m / gcd(n, m));
    }
}