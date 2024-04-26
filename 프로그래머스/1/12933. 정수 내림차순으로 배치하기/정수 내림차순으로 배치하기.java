import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String r = "";
        for (String s : str) { r += s; }
        
        return Long.parseLong(r);
    }
}