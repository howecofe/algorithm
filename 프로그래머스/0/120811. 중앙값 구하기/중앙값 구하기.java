import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        answer = array[array.length / 2];
        return answer;
    }
}