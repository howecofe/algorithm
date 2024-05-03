class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 0;
        int painted = 0;
        
        for (int num : section) {
            if (painted <= num) {
                painted = num + m;
                cnt++;
            }
        }
        
        return cnt;
    }
}