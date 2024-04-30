import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -1;
                    lost[j] = -1;
                    break;
                }
            }
        }
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] != -1 && lost[j] != -1) {
                    if (lost[j] == reserve[i] - 1) {
                        answer++;
                        lost[j] = -1;
                        break;
                    } else if (lost[j] == reserve[i] + 1) {
                        answer++;
                        lost[j] = -1;
                        break;
                    }
                }
            }
            
            if (answer > lost.length) { break; }
        }
        
        return n - lost.length + answer;
    }
}