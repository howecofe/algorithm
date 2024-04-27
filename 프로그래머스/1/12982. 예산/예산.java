import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int answer = d.length;
        
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            
            if (sum == budget) { answer = i + 1; break; }
            else if (sum > budget) { answer = i; break; }
        }
        
        return answer;
    }
}