class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        for (String s : strArr) {
            if (!s.equals(letter)) {
                answer += s;
            }
        }
        
        return answer;
    }
}