import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 방법 1
//         LinkedHashSet<String> set = new LinkedHashSet<>();
//         for (String str : my_string.split("")) {
//             set.add(str);
//         }
        
//         for (String data : set) {
//             answer += data;
//         }
        
        
        for (int i = 0; i < my_string.length(); i++) {
            // 방법 2
            if (i == my_string.indexOf(my_string.charAt(i))) {
                answer += my_string.charAt(i);
            }
            
            // 방법 3
            // if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
            //     answer += my_string.charAt(i);
            // }
        }
        
        return answer;
    }
}