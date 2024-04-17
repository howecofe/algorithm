import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] words = my_string.toLowerCase().toCharArray();
        Arrays.sort(words);
        
        return new String(words);
    }
}