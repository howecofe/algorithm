import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        
        return answer;
        
        // stream 사용
        // List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        // Collections.reverse(list);
        // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}