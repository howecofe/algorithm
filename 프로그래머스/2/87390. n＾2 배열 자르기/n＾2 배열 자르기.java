import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
//         int[][] doubleArr = new int[n][n];
//         int[] arr = new int[n * n];
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 for (int k = 0; k <= i; k++) {
//                     if (doubleArr[j][k] == 0) {
//                         doubleArr[j][k] = i + 1;
//                     }
//                 }
//             }
//         }
        
//         int cnt = 0;
//         for (int i = 0; i < doubleArr.length; i++) {
//             for (int j = 0; j < doubleArr[i].length; j++) {
//                 arr[cnt++] = doubleArr[i][j];
//             }
//         }
        
//         int[] answer = new int[(int)(right - left + 1)];
//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = arr[(int)(i + left)];
//         }
        
//         return answer;
        
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[(int)(right - left + 1)];
        
        // 필요한 라인만 구하기
        for (int i = (int)(left / n); i <= (int)(right / n); i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    list.add(i + 1);
                } else {
                    list.add(j + 1);
                }
            }
        }

        int start = (int)(left % n);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(start++);
        }
        
        return answer;
    }
}