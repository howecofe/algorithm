class Solution {
    public String[] solution(String my_string) {
        String s = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != ' ') {
                s += my_string.charAt(i);
            } else {
                if (i != my_string.length() - 1 && !s.isEmpty() && my_string.charAt(i + 1) != ' ') {
                    s += ' ';
                }
            }
        }
        return s.split(" ");
    }
}