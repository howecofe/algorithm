class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0, y = 0;
        
        for (String str : s.split("")) {
            if (str.equals("p")) { p++; }
            else if (str.equals("y")) { y++; }
        }
        
        if (p == 0 && y == 0) { return true; }
        else {
            if (p == y) { return true; }
            else { return false;}
        }
    
    }
}