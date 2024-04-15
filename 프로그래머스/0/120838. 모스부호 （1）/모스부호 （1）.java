import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        List<String> morse = new ArrayList<>(Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));
        
        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.size(); i++) {
                if (s.equals(morse.get(i))) {
                    answer += (char)(i + (int)'a');
                }                
            }
        }
        
        return answer;
    }
}