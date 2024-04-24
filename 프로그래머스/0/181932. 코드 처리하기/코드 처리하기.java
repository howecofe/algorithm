class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int i = 0 ; i < code.length(); i++) {      
            if (code.charAt(i) =='1') {
                mode = mode == 0 ? 1 : 0;
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) { ret += code.charAt(i); }
                } else {
                    if (i % 2 == 1) { ret += code.charAt(i); }
                }
            }
        }
        
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}