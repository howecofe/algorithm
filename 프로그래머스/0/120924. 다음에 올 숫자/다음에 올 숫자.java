class Solution {
    public int solution(int[] common) { 
        int diff = common[1] - common[0];
        boolean isArithmetic = true;
        for (int i = 0; i < common.length - 1; i++) {
            if (diff != common[i + 1] - common[i]) { 
                isArithmetic = false;
                break;
            }
        }
        
        int mul = 0;
        for (int i = 0; i < common.length - 1; i++) {
            if (common[i] != 0) { 
                mul = common[i + 1] / common[i];
                break;
            }
        }
        
        return isArithmetic ? common[common.length - 1] + diff : common[common.length - 1] * mul;
    }
}