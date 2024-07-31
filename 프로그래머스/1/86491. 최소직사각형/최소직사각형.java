class Solution {
    public int solution(int[][] sizes) {
        int mw = 0, mh = 0;

        for (int[] s : sizes) {
            mw = Math.max(mw, Math.max(s[0], s[1]));
            mh = Math.max(mh, Math.min(s[0], s[1]));
        }
        
        return mw * mh;
    }
}