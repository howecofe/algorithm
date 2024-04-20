class Solution {
    public int solution(int M, int N) {
        int min = 0;
        int max = 0;
        
        if (M < N) {
            min = M;
            max = N;
        } else {
            min = N;
            max = M;
        }
        
        return (min - 1) + min * (max - 1);
    }
}