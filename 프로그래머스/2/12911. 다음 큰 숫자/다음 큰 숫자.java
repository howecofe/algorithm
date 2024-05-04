class Solution {
    public int solution(int n) {
        String res1 = Integer.toBinaryString(n).replace("0", "");
        String res2 = "";
        
        while (!res1.equals(res2)) {
            n++;
            res2 = Integer.toBinaryString(n).replace("0", "");
        }
        
        return n;
    }
}