class Solution {
    public int solution(String my_string, String is_prefix) {
        if (!my_string.contains(is_prefix)) { return 0; }
        else {
            String str = "";
            for (int i = 0; i < is_prefix.length(); i++) {
                str += my_string.charAt(i);
            }
            return str.equals(is_prefix) ? 1 : 0;
        }
    }
}