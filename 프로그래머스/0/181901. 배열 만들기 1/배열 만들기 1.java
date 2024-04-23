import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
//         List<Integer> list = new ArrayList<>();
        
//         for (int i = 1; i <= n; i++) {
//             if (i % k == 0) { list.add(i); }
//         }
//         list.sort(Comparator.naturalOrder());
//         Integer[] integerArr = list.toArray(new Integer[0]);
//         int[] arr = new int[integerArr.length];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = integerArr[i];
//         }
//         return arr;
        
        int[] answer = new int[n / k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i + 1) * k;
        }
        return answer;
    }
}