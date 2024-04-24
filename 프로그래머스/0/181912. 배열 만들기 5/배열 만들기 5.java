import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> testList = new ArrayList<>();
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (k < num) { testList.add(num); }
        }
        int[] answer = new int[testList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = testList.get(i);
        }
        return answer;
    }
}