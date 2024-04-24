import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}