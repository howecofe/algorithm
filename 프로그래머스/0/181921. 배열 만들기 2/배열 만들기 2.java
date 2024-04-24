import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (Integer.toString(i).replaceAll("[0|5]", "").isEmpty()) { list.add(i); }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        Arrays.sort(answer);
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}