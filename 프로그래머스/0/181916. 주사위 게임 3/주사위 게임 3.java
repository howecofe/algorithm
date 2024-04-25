class Solution {
    public int solution(int a, int b, int c, int d) {        
        int[] cnt = new int[7];
        cnt[a]++;
        cnt[b]++;
        cnt[c]++;
        cnt[d]++;
        
        int count = 0;
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 1) { count++; }
            
            if (cnt[i] == 4) { return 1111 * i; }
            
            if (cnt[i] == 3) {
                for (int j = 1; j < cnt.length; j++) {
                    if (cnt[j] == 1) { return (10 * i + j) * (10 * i + j); }
                }
            }
            
            if (cnt[i] == 2) {
                for (int j = 1; j < cnt.length; j++) {
                    if (i != j) {
                        if (cnt[j] == 1) {
                            for (int k = 1; k < cnt.length; k++) {
                                if (j != k && cnt[k] == 1) { return j * k; }
                            }
                        }

                        if (cnt[j] == 2) { return (i + j) * Math.abs(i - j); }
                    }
                    
                }
            }
        }
        
        if (count == 4) { return Math.min(Math.min(a, b), Math.min(c, d)); }
        
        return -1;
    }
}