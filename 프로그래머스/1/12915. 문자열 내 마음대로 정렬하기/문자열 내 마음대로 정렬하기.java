import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 1. 인덱스 n번째를 문자열 앞에 추가한 배열을 만든다.
        // 2. 오름차순 정렬한다.
        // 3. strings 각 요소와 비교하여, 원래 문자열로 저장한다.
        
        String[] str = new String[strings.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(str);
        
        String[] answer = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (str[i].substring(1).equals(strings[j])) {
                    answer[i] = strings[j];
                    break;
                }
            }
            
        }
        return answer;
    }
}