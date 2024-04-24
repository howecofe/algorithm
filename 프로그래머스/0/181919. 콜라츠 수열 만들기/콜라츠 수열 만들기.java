import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> testList = new ArrayList<>();
        
        while (n != 1) {
            testList.add(n);
            if (n % 2 == 0) { n /= 2; }
            else { n = 3 * n + 1; }
        }
        if (n == 1) { testList.add(n); }
        
        int[] answer = new int[testList.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = testList.get(i); }
        return answer;
    }
}