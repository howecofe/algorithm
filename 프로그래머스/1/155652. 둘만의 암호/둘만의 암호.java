class Solution {
    public String solution(String s, String skip, int index) {
        String spell = "";
        for (int i = 'a'; i <= 'z'; i++) {
            if (!skip.contains(String.valueOf((char)i))) {
                spell += (char)i;
            }
        }
        
        String answer = "";
        for (String str : s.split("")) {
            answer += spell.charAt((spell.indexOf(str) + index) % spell.length());
        }
        
        return answer;
    }
}