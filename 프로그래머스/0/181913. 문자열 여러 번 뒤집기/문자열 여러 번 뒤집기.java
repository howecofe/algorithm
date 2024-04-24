class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            String re = "";
            for (int j = e; j >= s; e--) {
                re += my_string.charAt(i);
            }
            
            my_string = my_string.substring(0, s) + re + my_string.substring(e + 1);
        }
        
        return my_string;
    }
}