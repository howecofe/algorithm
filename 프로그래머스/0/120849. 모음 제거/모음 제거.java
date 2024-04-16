class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowl = {"a", "e", "i", "o", "u"};
        
        for (String str : my_string.split("")) {
            boolean isVowl = false;
            for (String v : vowl) {
                if (str.equals(v)) {
                    isVowl = !isVowl;
                    break;
                }
            }
            if (!isVowl) answer += str;
        }
        
        return answer;
    }
}