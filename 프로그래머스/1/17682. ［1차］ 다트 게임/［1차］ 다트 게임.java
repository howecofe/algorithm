import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('S', 1);
        map.put('D', 2);
        map.put('T', 3);
        
        String strNum = "";
        for (char c : dartResult.toCharArray()) {
            if ('0' <= c && c <= '9') { // Character.isDigit()
                strNum += c;
            } else if (c == 'S' || c == 'D' || c == 'T') {
                list.add((int) Math.pow(Integer.parseInt(strNum), map.get(c)));
                strNum = "";
            } else {
                if (c == '#') {
                    list.set(list.size() - 1, list.get(list.size() - 1) * -1);
                } else {
                    if (list.size() == 1) {
                        list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                    } else {
                        list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                        list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                    }
                }
            }
        }
        
        for (int num : list) { answer += num; }
        
        return answer;
    }
}