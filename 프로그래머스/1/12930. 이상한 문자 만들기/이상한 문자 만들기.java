class Solution {
    public String solution(String s) {        
        String answer = "";
        s = s.toLowerCase();
        
        String[] string = s.split(" ", -1);
        for (int i = 0; i < string.length; i++) {
            String word = "";
            for (int j = 0; j < string[i].length(); j++) {
                word += j % 2 == 0 ? String.valueOf(string[i].charAt(j)).toUpperCase() : string[i].charAt(j);
            }
            
            answer += word + (i == string.length - 1 ? "" : " ");
        }
        
        return answer;
    }
}