import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int idx = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (k == idx) { break; }
            if (list.size() == 0) {
                answer[idx++] = num;
                list.add(num);
            }
            else {
                boolean exists = false;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == num) {
                        exists = true;
                        break;
                    } 
                }
                if (!exists) {
                    answer[idx++] = num;
                    list.add(num);
                }
            }
        }
        
        return answer;
    }
}