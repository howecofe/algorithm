import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<int[]> list = new ArrayList<>();
        
        for (int i = 1; i <= 3; i++) {
            int[] arr;
            
            if (i == 1) arr = new int[]{1, 2, 3, 4, 5};
            else if (i == 2) arr = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
            else arr = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            
            int len = arr.length;
            int cnt = 0;
            
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == arr[j % len]) cnt++;
            }
            
            if (list.isEmpty() || list.get(list.size() - 1)[1] == cnt) {
                list.add(new int[]{i, cnt});
            } else if (list.get(list.size() - 1)[1] < cnt) {
                list.set(list.size() - 1, new int[]{i , cnt});
            }
        }
        
        // list -> array
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = list.get(i)[0];
        
        return answer;
    }
}