import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        // 1. 정렬 이용하기
//         // Note. i를 전역변수로 선언 후, for문 내에서도 사용한다.
//         // int i = 0; 
//         // if (completion.length == 0) { return participant[0]; }
        
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         // if (!completion[completion.length - 1].equals(participant[participant.length - 1])) {
//         //     return participant[participant.length - 1];
//         // }
        
//         for (int i = 0; i < completion.length; i++) {
//             if (!participant[i].equals(completion[i])) { return participant[i]; }
//         }
        
//         return participant[participant.length - 1];
        
        // 2. HashMap 이용하기
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String player : participant) { map.put(player, map.getOrDefault(player, 0) + 1); }
        for (String player : completion) { map.put(player, map.get(player) - 1); }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) { answer = key; }
        }
        
        return answer;
    }
}