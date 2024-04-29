import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        if (completion.length == 0) { return participant[0]; }
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        if (!completion[completion.length - 1].equals(participant[participant.length - 1])) {
            return participant[participant.length - 1];
        }
        
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) { answer = participant[i]; break; }
        }
        
        return answer;
    }
}