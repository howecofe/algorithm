import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(i) - '0';
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}