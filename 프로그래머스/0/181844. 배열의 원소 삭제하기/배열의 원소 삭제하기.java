import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            for (int num : delete_list) {
                if (arr[i] == num) { 
                    exists = true;
                    break;
                }
            }
            if (!exists) { testList.add(arr[i]); }
        }
        
        int[] answer = new int[testList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = testList.get(i);
        }
        return answer;
    }
}