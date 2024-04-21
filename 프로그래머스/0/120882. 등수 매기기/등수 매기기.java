import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
 
        String usedIdx = "";
        for (int i = 0; i < score.length; i++) {
            int max = 0;
            int maxIdx = 0;
            for (int j = 0; j < score.length; j++) {
                if (!usedIdx.contains(String.valueOf(j))) {
                    if (max < score[j][0] + score[j][1]) {
                        max = score[j][0] + score[j][1];
                    }
                }
            }
            
            int cnt = 0;
            for (int j = 0; j < score.length; j++) {
                if (max == score[j][0] + score[j][1]) {
                    maxIdx = j;
                    answer[maxIdx] = i + 1;
                    usedIdx += String.valueOf(maxIdx);
                    cnt++;
                }
            }
            i += cnt - 1;
        }
            
        return answer;
    }
}