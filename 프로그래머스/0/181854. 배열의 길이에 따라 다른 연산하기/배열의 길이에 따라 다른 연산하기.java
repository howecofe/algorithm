import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        
        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i += 2) {
                answer[i] += n;
            }
        } else {
            for (int i = 1; i < arr.length; i += 2) {
                answer[i] += n;
            }
        }
        
        return answer;
    }
}