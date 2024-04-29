import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // Note. i를 전역변수로 선언 후, for문 내에서도 사용한다.
        int i = 0; 
        // if (completion.length == 0) { return participant[0]; }
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // if (!completion[completion.length - 1].equals(participant[participant.length - 1])) {
        //     return participant[participant.length - 1];
        // }
        
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) { return participant[i]; }
        }
        
        return participant[i];
    }
}