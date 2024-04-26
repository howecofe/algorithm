import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) { return new int[]{-1}; }
        
        int[] copied = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copied);
        
        int idx = 0;
        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != copied[0]) { answer[idx++] = arr[i]; }
        }
        return answer;
    }
}