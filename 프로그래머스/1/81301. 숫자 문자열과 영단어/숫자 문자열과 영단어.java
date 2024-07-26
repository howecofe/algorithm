import java.util.*;

class Solution {
    static Map<String, String> map = new HashMap<>();
    public int solution(String s) {
//         map.put("zero", "0");
//         map.put("one", "1");
//         map.put("two", "2");
//         map.put("three", "3");
//         map.put("four", "4");
//         map.put("five", "5");
//         map.put("six", "6");
//         map.put("seven", "7");
//         map.put("eight", "8");
//         map.put("nine", "9");
        
//         StringBuilder res = new StringBuilder();
//         StringBuilder sb = new StringBuilder();
        
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if ('0' <= c && c <= '9') res.append(c);
//             else {
//                 sb.append(c);
//                 String str = sb.toString();
//                 if (map.containsKey(str)) {
//                     res.append(map.get(str));
//                     sb.delete(0, sb.toString().length());
//                 }
//             }
//         }

//         return Integer.parseInt(res.toString());
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}