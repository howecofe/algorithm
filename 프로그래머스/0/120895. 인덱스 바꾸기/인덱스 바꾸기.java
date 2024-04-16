class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String tmp = "";
        String[] words = my_string.split("");
        tmp = words[num1];
        words[num1] = words[num2];
        words[num2] = tmp;
        
        for (String w : words) {
            answer += w;
        }
        
        return answer;
    }
}