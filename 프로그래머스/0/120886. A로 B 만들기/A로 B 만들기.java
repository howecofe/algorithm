import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] bef = before.split("");
        String[] aft = after.split("");
        
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        boolean isEqual = true;
        for (int i = 0; i < bef.length; i++) {
            if (!bef[i].equals(aft[i])) {
                isEqual = false;
                break;
            }
        }
        
        return (isEqual) ? 1 : 0;
    }
}