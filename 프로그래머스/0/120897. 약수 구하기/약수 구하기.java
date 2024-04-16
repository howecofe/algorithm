import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> testList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { testList.add(i); }
        }
    
        int[] answer = new int[testList.size()];
        for (int i = 0; i < testList.size(); i++) {
            answer[i] = testList.get(i);
        }

        Arrays.sort(answer);
        
        return answer;
    }
}