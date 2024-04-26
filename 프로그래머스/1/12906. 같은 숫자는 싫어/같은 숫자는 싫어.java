import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int tmp = arr[0];
        list.add(tmp);
        for (int i = 1; i < arr.length ; i++) {
            if (tmp != arr[i]) {
                list.add(arr[i]);
                tmp = arr[i];
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        return answer;
    }
}