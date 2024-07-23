import java.util.*;

class Solution {
    static int cnt;
    static Map<String, Integer> map = new HashMap<>();
    public int solution(String[][] clothes) {
        // 의상들이 담긴 2차원 배열 clothes
        // 서로 다른 옷의 조합의 수를 return

        // 1개 : a = (a + 1) - 1
        // 2개 : a + b + ab = (a + 1)(b + 1) - 1
        // 3개 : a + b + c + ab + ac + bc + abc= (a + 1)(b + 1)(c + 1) - 1 
        
        for (String[] c : clothes) map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        cnt = 1;
        
        for (String key : map.keySet()) {
            cnt *= map.get(key) + 1;
        }
        
        return cnt - 1;
    }
}