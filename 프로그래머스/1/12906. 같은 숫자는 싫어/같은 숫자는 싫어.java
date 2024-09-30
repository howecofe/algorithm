import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int n : arr) {
            if (list.isEmpty() || list.get(list.size() - 1) != n) list.add(n);
        }
        
        // list -> array
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = list.get(i);
        
        return answer;
    }
}