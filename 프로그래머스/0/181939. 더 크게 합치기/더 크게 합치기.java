class Solution {
    public int solution(int a, int b) {
        // int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        // int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        
        return ab < ba ? ba : ab;
    }
}