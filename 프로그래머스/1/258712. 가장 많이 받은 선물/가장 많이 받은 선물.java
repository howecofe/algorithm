import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> idx = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            idx.put(friends[i], i);
        }
        
        // 2차원 배열에 선물 기록
        int[][] record = new int[friends.length][friends.length];
        for (String gift : gifts) {
            String[] part = gift.split(" ");
            String giver = part[0];
            String taker = part[1];
            
            record[idx.get(giver)][idx.get(taker)]++;
        }
        
        // 선물 지수
        Map<String, Integer> giftIdx = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            int giveCnt = 0, takeCnt = 0;
            for (int j = 0; j < record[i].length; j++) { 
                giveCnt += record[i][j];
                takeCnt += record[j][i];
            }
            
            giftIdx.put(friends[i], giveCnt - takeCnt);
        }
        
        int[] answer = new int[friends.length];
        
        for (int i = 0; i < record.length; i++) {
            for (int j = i + 1; j < record[i].length; j++) {
                if (record[i][j] > record[j][i]) {
                    answer[i]++;
                } else if (record[i][j] < record[j][i]) {
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