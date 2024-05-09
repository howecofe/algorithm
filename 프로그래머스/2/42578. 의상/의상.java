import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 방정식 찾기
        // 종류 1가지: a개 = (a + 1) - 1
        // 종류 2가지: a + b + ab = (a + 1)(b + 1) -1
        // 종류 3가지: a + b + c + ab + ac + bc + abc = (a + 1)(b + 1)(c + 1) - 1
           
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        
        int answer = 1;
        for (Integer val : map.values()) {
            answer *= val + 1;
        }
        
        return --answer;
    }
}