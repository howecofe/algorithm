class Solution {
    public int solution(int n) {
        int num = 0;
        int fac = 1;
        
        while (n >= fac) {
            fac *= ++num;
        }
        
        return num - 1;
    }
}