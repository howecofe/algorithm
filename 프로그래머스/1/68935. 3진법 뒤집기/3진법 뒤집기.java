class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        String s = sb.reverse().toString();
        
        return Integer.parseInt(s, 3);
    }
}