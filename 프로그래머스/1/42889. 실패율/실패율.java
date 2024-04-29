import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        
        int totalCnt = stages.length;
        for (int i = 1; i <= N; i++) {
            int failCnt = 0;
            for (int stg : stages) {
                if (stg == i) { failCnt++; }
            }
            totalCnt -= failCnt;
            map.put(i, failCnt == 0 ? 0 : failCnt / (double) totalCnt);
        }
        
        int[] answer = new int[N];
        for (int j = 0; j < answer.length; j++) {
            double max = -1;
            int maxIdx = 0;
            // 최댓값 구하기
            for (int i = 1; i <= N; i++) {
                if (max < map.get(i)) { max = map.get(i); }
            }
            
            // index가 작은 최댓값 구하기
            for (int i = 1; i <= N; i++) {
                if (max == map.get(i)) { maxIdx = i; break; }
            }
            
            answer[j] = maxIdx;
            map.put(maxIdx, -1.0);
        }
        
        return answer;
    }
}