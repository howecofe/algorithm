class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if ('a' <= c && c < 'l') { answer += 'l'; }
            else { answer += c; }
        }
        return answer;
    }
}