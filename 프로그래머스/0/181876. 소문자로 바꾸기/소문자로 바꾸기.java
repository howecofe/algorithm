class Solution {
    public String solution(String myString) {
        String answer = "";
        for (String s : myString.split("")) {
            answer += s.toLowerCase();
        }
        return answer;
    }
}