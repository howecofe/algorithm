import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int arr1[] = new int[arr.length];
        int x = 0;
        int[] next = {};
        int[] prev = Arrays.copyOf(arr, arr.length);
        
        while (true) {
            x++;
            boolean sameArr = true;
            
            next = Arrays.copyOf(prev, prev.length);
            for (int i = 0; i < next.length; i++) {
                if (prev[i] >= 50 && prev[i] % 2 == 0) {
                    next[i] = prev[i] / 2;
                } else if (prev[i] < 50 && prev[i] % 2 == 1) {
                    next[i] = prev[i] * 2 + 1;
                }
            }
            
            for (int i = 0; i < next.length; i++) {
                if (next[i] != prev[i]) { sameArr = false; break; }
            }
            
            if (sameArr) { break; }
            prev = Arrays.copyOf(next, next.length);
        }
        
        return x - 1;
    }
}