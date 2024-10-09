import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h = citations[citations.length - 1];
        
        while (h > 0) {
            int cnt = 0;
            for (int i = citations.length - 1; i >= 0; i--) {
                if (citations[i] >= h) cnt++;
            }
            if (cnt >= h) break;
            h--;
        }
        
        return h;
    }
}