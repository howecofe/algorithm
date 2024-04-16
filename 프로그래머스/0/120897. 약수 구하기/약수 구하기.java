import java.util.*;

class Solution {
    public int[] solution(int n) {
        int len = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                len++;
            }
        }
        
        int[] answer = new int[len];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[idx] = i;
                idx++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}