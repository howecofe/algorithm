class Solution {
    public int[] solution(int[] num_list) {        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) cnt1++;
            else cnt2++;
        }
        
        return new int[] {cnt1, cnt2};
    }
}