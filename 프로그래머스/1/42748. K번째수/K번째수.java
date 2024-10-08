import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int m = 0; m < commands.length; m++) {
            int i = commands[m][0] - 1;
            int j = commands[m][1] - 1;
            int k = commands[m][2] - 1;
            
            int[] tmp = new int[j - i + 1];
            for (int n = i; n <= j; n++) {
                tmp[n - i] = array[n];
            }
            
            Arrays.sort(tmp);
            answer[m] = tmp[k];
        }
        
        return answer;
    }
}