import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }
        
        Integer[] sortedArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedArr, Collections.reverseOrder());
        
        for (int i = 0; i < sortedArr.length; i++) {
            answer[map.get(sortedArr[i])] = i + 1;
        }

        return answer;
    }
}