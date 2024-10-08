import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();
        boolean allZero = true;
        
        for (int n : numbers) {
            if (n != 0) allZero = false;
            list.add(String.valueOf(n));
        }
        
        // numbers의 모든 원소가 0인 경우
        if (allZero) return "0";
        
        list.sort((o1, o2) -> o2.repeat(3).compareTo(o1.repeat(3)));
        
        for (String s : list) answer += s;
        
        return answer;
    }
}