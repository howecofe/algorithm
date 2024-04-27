import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
//         Arrays.sort(d);
//         int sum = 0;
//         int answer = d.length;
        
//         for (int i = 0; i < d.length; i++) {
//             sum += d[i];
            
//             if (sum == budget) { answer = i + 1; break; }
//             else if (sum > budget) { answer = i; break; }
//         }
        
//         return answer;
        
        Arrays.sort(d);
        int answer = 0;
        
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            
            if (budget < 0) { break; }
            
            answer++;
        }
        
        return answer;
    }
}