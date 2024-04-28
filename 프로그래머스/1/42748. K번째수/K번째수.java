import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < answer.length; i++) {
            // List<Integer> list = new ArrayList<>();
            // for (int j = commands[i][0] - 1; j < commands[i][1]; j++) { list.add(array[j]); }
            // list.sort(Comparator.naturalOrder());
            // answer[i] = list.get(commands[i][2] - 1);
            
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }
}