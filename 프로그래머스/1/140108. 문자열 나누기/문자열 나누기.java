import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        
        while (s.length() > 0) {
            char target = s.charAt(0);
            int sameCnt = 0, diffCnt = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (target == s.charAt(i)) { sameCnt++;}
                else { diffCnt++; }
                
                if (sameCnt == diffCnt) {
                    list.add(s.substring(0, i + 1));
                    s = s.substring(i + 1);
                    break;
                } else {
                    if (i == s.length() - 1) {
                        list.add(s.substring(0, i + 1));
                        s = "";
                    }
                }
            }
        }
        
        return list.size();
    }
}