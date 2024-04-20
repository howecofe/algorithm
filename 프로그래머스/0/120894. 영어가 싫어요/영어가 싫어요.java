import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String str = numbers;
        for (int i = 0 ; i < alpha.length; i++) {
            str = str.replace(alpha[i], String.valueOf(i));
        }
        
        return Long.parseLong(str);
    }
}