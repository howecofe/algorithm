import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] top3 = new int[k];
        Arrays.fill(top3, -1);
        
        for (int i = 0; i < answer.length; i++) {
            if (i < k) {
                top3[i] = score[i];
                int min = top3[0];
                for (int num : top3) {
                    if (num != -1 && min > num) {
                        min = num;
                    }
                }
                answer[i] = min;
            } else {
                Arrays.sort(top3);
                if (score[i] > top3[0]) {
                    top3[0] = score[i];
                    Arrays.sort(top3);
                }
                answer[i] = top3[0];
            }
        }
        
        return answer;
    }
}