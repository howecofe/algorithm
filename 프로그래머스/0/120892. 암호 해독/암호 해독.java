class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // String[] words = cipher.split("");
        // for (int i = 1; i <= words.length; i++) {
        //     if (i % code == 0) answer += words[i - 1];
        // }

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        
        return answer;
    }
}