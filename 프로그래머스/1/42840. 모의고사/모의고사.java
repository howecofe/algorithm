import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
//         int[] scores = new int[3];
//         for (int i = 0; i < answers.length; i++) {
//             if (answers[i] == i % 5 + 1) { scores[0]++; }
            
//             int[] arr1 = new int[]{1, 3, 4, 5};
//             if (i % 2 == 0 && answers[i] == 2) { scores[1]++; }
//             else if (i % 2 == 1 && answers[i] == arr1[(i / 2) % 4]) { scores[1]++; }
            
//             int[] arr2 = new int[]{3, 1, 2, 4, 5};
//             if (answers[i] == arr2[(i / 2) % 5]) { scores[2]++; }
//         }
        
//         // max 점수가 3명인 경우
//         if (scores[0] == scores[1] && scores[1] == scores[2]) { return new int[]{1, 2, 3}; }
        
//         int max = scores[0];
//         int idx = 0;
//         for (int i = 0; i < scores.length; i++) {
//             if (max < scores[i]) {
//                 max = scores[i];
//                 idx = i;
//             }
//         }
        
//         for (int i = 0; i < scores.length; i++) {
//             // max 점수가 2명인 경우
//             if (i != idx && max == scores[i]) {
//                 return new int[]{Math.min(i, idx) + 1, Math.max(i, idx) + 1};
//             }
//         }
        
//         // max 점수가 1명인 경우
//         return new int[]{idx + 1};
        
        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] hit = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) { hit[0]++; }
            if (answers[i] == pattern2[i % pattern2.length]) { hit[1]++; }
            if (answers[i] == pattern3[i % pattern3.length]) { hit[2]++; }
        }
        
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < hit.length; i++) {
            if (max == hit[i]) { list.add(i + 1); }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        
        return answer;
    }
}