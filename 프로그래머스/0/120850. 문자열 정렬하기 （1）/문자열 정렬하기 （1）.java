import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
    
        // my_string 안에 숫자 개수 카운트
        for (char c : my_string.toCharArray()) {
            if ('0' <= c && c <= '9') cnt++;
        }
        
        // 숫자를 answer 배열에 넣기
        int[] answer = new int[cnt];
        int idx = 0;
        for (char c : my_string.toCharArray()) {
            if (idx == cnt) break;
            
            if ('0' <= c && c <= '9') {
                answer[idx] = c - '0';
                idx++;
            }
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}