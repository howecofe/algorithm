import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        int[] absList = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            absList[i] = Math.abs(numlist[i] - n);
        }
        Arrays.sort(absList);
        
        for (int i = 0; i < absList.length; i++) {
            int cnt = 0;
            int val = 0;
            for (int j = 0; j < numlist.length; j++) {
                if (absList[i] == Math.abs(numlist[j] - n)) {
                    cnt++;
                    val = numlist[j];
                }
            }
            
            if (cnt == 1) {
                answer[i] = val;
            } else {
                answer[i] = n + absList[i];
                answer[++i] = n - absList[i];
            }
        }
        return answer;
    }
}