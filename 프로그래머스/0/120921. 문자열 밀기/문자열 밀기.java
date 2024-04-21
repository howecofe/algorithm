class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) { return 0; }
        
        for (int cnt = 1; cnt < A.length(); cnt++) {
            String[] before = A.split("");
            String[] after = new String[A.length()];
            String lastStr = before[before.length - 1];
            for (int i = 0; i < before.length; i++) {
                if (i != before.length - 1) {
                    after[i + 1] = before[i];
                } else {
                    after[0] = lastStr;
                }
            }
            
            A = "";
            for (int i = 0; i < after.length; i++) {
                A += after[i];
            }
            
            if (A.equals(B)) { return cnt; }
        }
        
        return -1;
    }
}