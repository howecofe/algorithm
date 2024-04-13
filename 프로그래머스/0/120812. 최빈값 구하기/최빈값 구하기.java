import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1000];
        
        for (int num : array) {
            cnt[num]++;
        }
        
        int max = cnt[0];
        int answer = 0;     
        for (int i = 0; i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
                answer = i;
            }
        }
        
        // 최빈값이 여러개면 -1 리턴
        Arrays.sort(cnt);
        if (cnt[cnt.length - 1] == cnt[cnt.length - 2]) answer = -1;
        
        return answer;
    }
}