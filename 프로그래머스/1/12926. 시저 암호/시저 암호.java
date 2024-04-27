class Solution {
    public String solution(String s, int n) {
        String answer = "";
     
        for (int i = 0; i < s.length(); i++) {
            char c = 'A';
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { c = 'a'; }
        
            answer += s.charAt(i) == ' '? ' ' : (char)(c + (s.charAt(i) + n - c) % 26);
        }
        return answer;
    }
}