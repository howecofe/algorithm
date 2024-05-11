import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        
        String[] strArr = s.split("}");
        for (int i = 0; i < strArr.length; i++) {
            String[] string = strArr[i].replaceAll("[{}]", "").split(",");
            for (String str : string) {
                if (!str.isEmpty()) {
                    int num = Integer.parseInt(str);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> map.get(o2) - map.get(o1));
        
        int[] answer = new int[keySet.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}