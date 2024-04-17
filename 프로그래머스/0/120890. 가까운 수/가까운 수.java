import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        // array 요소와 n의 차이를 저장한다.
        int[] diff = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            diff[i] = Math.abs(n - array[i]);
        }
        
        // 차이가 최소인 값의 인덱스를 찾는다.
        int min = diff[0];
        int idx = 0;
        for (int i = 0; i < diff.length; i++) {
            if (min > diff[i]) { 
                min = diff[i];
                idx = i;
            }
        }
        
        return array[idx];
    }
}