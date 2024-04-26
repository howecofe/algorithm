import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        
        for (int n : arr) {
            if (n % divisor == 0) { list.add(n); }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}