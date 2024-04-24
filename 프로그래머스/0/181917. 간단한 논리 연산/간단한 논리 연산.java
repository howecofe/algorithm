class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         boolean b1 = true, b2 = true;
        
//         if (!x1 && !x2) { b1 = false; }
//         if (!x3 && !x4) { b2 = false; }
        
//         return b1 && b2;
        
        return (x1 || x2) && (x3 || x4);
    }
}