import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        return (new String(bef).equals(new String(aft))) ? 1 : 0;
    }
}