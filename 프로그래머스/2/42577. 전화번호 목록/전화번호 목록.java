import java.util.*;

class Solution {
    static Map<String, Integer> map = new HashMap<>();
    public boolean solution(String[] phone_book) {
        // 전화번호를 담은 배열 phone_book
        // 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return

        // 풀이
        for (String ph : phone_book) map.put(ph, 0);
        
        for (String ph : phone_book) {
            for (int i = 1; i < ph.length(); i++) { // 자기 자신은 제외해야하므로 등호 제외
                if (map.containsKey(ph.substring(0, i))) return false;
            }
        }
        return true;
    }
}