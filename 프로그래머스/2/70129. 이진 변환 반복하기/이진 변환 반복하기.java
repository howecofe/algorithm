class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zero = 0;
        
        while (!s.equals("1")) {
            cnt++;
            
            int beforeLen = s.length();
            int afterLen = s.replace("0", "").length();
            zero += beforeLen - afterLen;
            
            s = Integer.toBinaryString(afterLen); // Integer.toString(afterLen, 2)
        }
        
        
        return new int[]{cnt, zero};
    }
}