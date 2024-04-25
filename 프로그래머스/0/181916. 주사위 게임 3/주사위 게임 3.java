import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 1. 카운트 배열을 이용한 풀이
//         int[] cnt = new int[7];
//         cnt[a]++;
//         cnt[b]++;
//         cnt[c]++;
//         cnt[d]++;
        
//         int count = 0;
//         for (int i = 1; i < cnt.length; i++) {
//             if (cnt[i] == 1) { count++; }
            
//             if (cnt[i] == 4) { return 1111 * i; }
            
//             if (cnt[i] == 3) {
//                 for (int j = 1; j < cnt.length; j++) {
//                     if (cnt[j] == 1) { return (10 * i + j) * (10 * i + j); }
//                 }
//             }
            
//             if (cnt[i] == 2) {
//                 for (int j = 1; j < cnt.length; j++) {
//                     if (i != j) {
//                         if (cnt[j] == 1) {
//                             for (int k = 1; k < cnt.length; k++) {
//                                 if (j != k && cnt[k] == 1) { return j * k; }
//                             }
//                         }

//                         if (cnt[j] == 2) { return (i + j) * Math.abs(i - j); }
//                     }
                    
//                 }
//             }
//         }
        
//         if (count == 4) { return Math.min(Math.min(a, b), Math.min(c, d)); }
        
//         return -1;
        
        // 2. 정렬을 이용한 풀이
        int answer = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) { 
            answer = dice[0] * 1111;
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } else {
            answer = dice[0];
        }
        
        return answer;
    }
}