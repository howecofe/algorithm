class Solution {
    public String solution(String my_string, int s, int e) {
        // StringBuilder sb = new StringBuilder();
        // String s1 = "";
        // String s2 = "";
        // for (int i = 0; i < my_string.length(); i++) {
        //     if (i < s) { s1 += my_string.charAt(i); }
        //     else if (s <= i && i <= e) { sb.insert(0, my_string.charAt(i)); }
        //     else { s2 += my_string.charAt(i); }
        // }
        // return s1 + sb.toString() + s2;
        
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        return my_string.substring(0, s) + sb.reverse() + my_string.substring(e + 1);
    }
}