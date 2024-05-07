import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[elements.length * 2];
        
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }
         
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += arr[k];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}