import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
//         String str = "";
//         for (String s : str_list) { str += s; }
        
//         String result = "";
//         int li = str.indexOf("l");
//         int ri = str.indexOf("r");
        
//         if (li != -1 && ri != -1) {
//             if (0 < li && li < ri) { 
//                 result = str.substring(0, li);
//             } else if (ri != str.length() - 1 && ri < li) { 
//                 result = str.substring(ri + 1);
//             }
//         } else if (li != -1 && ri == -1) {
//             if (0 < li) { result = str.substring(0, li); }
//         } else if (li == -1 && ri != -1) {
//             if (ri != str.length() - 1) { result = str.substring(ri + 1); }
//         }
        
//         return result.isEmpty() ? new String[]{} : result.split("");
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        
        return new String[0]; // new String[]{};
    }
}

// [Note] Arrays.copyOfRange() 메서드는 범위가 유효하지 않은 경우 길이가 0인 빈 문자열 반환 (new String[0]와 동일)