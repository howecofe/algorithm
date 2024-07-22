import java.util.*;

class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static String answer;
    public String solution(String[] participant, String[] completion) {
        // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant
        // 완주한 선수들의 이름이 담긴 배열 completion
        // 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주
        // 완주하지 못한 선수의 이름을 return

        // 풀이
        for (String p : participant) map.put(p, map.getOrDefault(p, 0) + 1);
        for (String c : completion) map.put(c, map.get(c) - 1);

        // 출력
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) answer = e.getKey();
        }

        return answer;
    }
}