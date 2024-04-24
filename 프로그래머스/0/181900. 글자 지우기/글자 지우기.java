class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i : indices) {
            str[i] = "-";
        }
        for (int i = 0 ; i < str.length; i++) {
            answer += str[i];
        }
        return answer.replace("-", "");
    }
}