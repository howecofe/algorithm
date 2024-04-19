class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int)Math.ceil(my_str.length() / (double)n);
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i ++) {
            if (i != len - 1) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            } else {
                answer[i] = my_str.substring(i * n);
            }
        }
        return answer;
    }
}