import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> idx = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            idx.put(friends[i], i);
        }
        
        // -1이면 주고받은 기록이 없는 상태
        int[][] cntArr = new int[friends.length][friends.length];
        for (int i = 0; i < cntArr.length; i++) {
            Arrays.fill(cntArr[i], -1);
        }
        
        // 2차원 배열에 선물 기록
        for (String gift : gifts) {
            String[] part = gift.split(" ");
            String giver = part[0];
            String taker = part[1];
            
            if (cntArr[idx.get(giver)][idx.get(taker)] == -1) {
                cntArr[idx.get(giver)][idx.get(taker)] = 1;
                cntArr[idx.get(taker)][idx.get(giver)] = 0;
            } else {
                cntArr[idx.get(giver)][idx.get(taker)]++;
            }
        }
        
        // 선물 지수
        Map<String, Integer> giftIdx = new HashMap<>();
        for (int i = 0; i < cntArr.length; i++) {
            int giveCnt = 0, takeCnt = 0;
            for (int j = 0; j < cntArr[i].length; j++) { 
                if (cntArr[i][j] != -1) {
                    giveCnt += cntArr[i][j];
                    takeCnt += cntArr[j][i];
                }  
            }
            
            giftIdx.put(friends[i], giveCnt - takeCnt);
        }
        
        int[] answer = new int[friends.length];
        
        for (int i = 0; i < cntArr.length; i++) {
            for (int j = i + 1; j < cntArr[i].length; j++) {
                if (cntArr[i][j] > cntArr[j][i]) {
                    answer[i]++;
                } else if (cntArr[i][j] < cntArr[j][i]) {
                    answer[j]++;
                } else {
                    if (giftIdx.get(friends[i]) > giftIdx.get(friends[j])) {
                        answer[i]++;
                    } else if (giftIdx.get(friends[i]) < giftIdx.get(friends[j])) {
                        answer[j]++;
                    }
                }
            }
        }
        
        Arrays.sort(answer);
            
        return answer[friends.length - 1];
    }
}