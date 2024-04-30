class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int sameCnt = 0;
        int zeroCnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) { zeroCnt++; }
            else {
                for (int num : win_nums) {
                    if (lotto == num) { sameCnt++; break; }
                }
            }
        }
        
        int highest = getRank(sameCnt + zeroCnt);
        int lowest = getRank(sameCnt);
        
        return new int[]{highest, lowest};
    }
    
    private static int getRank(int cnt) {
        if (cnt == 0 || cnt == 1) { return 6; }
        else { return 7 - cnt; }
    }
    
}