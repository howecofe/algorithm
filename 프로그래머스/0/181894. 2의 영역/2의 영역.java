import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int maxIdx = -1;
        int minIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                minIdx = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                maxIdx = i;
                break;
            }
        }
        
        return minIdx == -1 ? new int[]{-1} : Arrays.copyOfRange(arr, minIdx, maxIdx + 1);
    }
}