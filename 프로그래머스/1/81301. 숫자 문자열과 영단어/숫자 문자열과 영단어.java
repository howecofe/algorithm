import java.util.*;

class Solution {
    public int solution(String s) {
//         Map<String, String> map = new HashMap<>();
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

//         String word = "";
//         String numStr = "";
//         for (char c : s.toCharArray()) {
//             if ('0' <= c && c <= '9') { word += c; }
//             else {
//                 numStr += c;
                
//                 for (String k : map.keySet()) {
//                     if (k.equals(numStr)) { 
//                         word += map.get(k);
//                         numStr = "";
//                         break;
//                     }
//                 }
//             }
//         }
        
//         return Integer.parseInt(word);
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}