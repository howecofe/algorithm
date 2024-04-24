class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0 ; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            boolean exists = false;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {                
                if (queries[i][2] < arr[j] && min > arr[j]) {
                    min = arr[j];
                    exists = true;
                }
            }
            if (exists) { answer[i] = min; }
            else { answer[i] = -1; }
        }
        
        return answer;
    }
}