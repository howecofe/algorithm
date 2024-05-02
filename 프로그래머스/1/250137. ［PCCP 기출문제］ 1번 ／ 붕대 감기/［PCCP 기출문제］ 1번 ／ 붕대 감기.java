import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currHp = health;
        int successCnt = 0;
        int time = bandage[0];
        int powerPerSec = bandage[1];
        int bonusPower = bandage[2];
        
        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
        }
        
        for (int t = 0; t <= attacks[attacks.length - 1][0]; t++) {
            
            if (!attackMap.containsKey(t)) {
                successCnt++;
                currHp += powerPerSec;
            } else {
                currHp -= attackMap.get(t);
                successCnt = 0;
            }
            
            if (currHp <= 0) { return -1; }
            
            if (successCnt == time) {
                currHp += bonusPower;
                successCnt = 0;
            }
            
            if (currHp > health) { currHp = health; }
            
        }
        
        return currHp;
    }
}