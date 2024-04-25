import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;
        answer[idx++] = arr[0];
        
        for (int num : arr) {
            if (k == idx) { break; }

            boolean exists = false;
            for (int i = 0; i < answer.length; i++) {
                if (answer[i] == num) {
                    exists = true;
                    break;
                } 
            }
            if (!exists) { answer[idx++] = num; }
        }
        
        return answer;
    }
}