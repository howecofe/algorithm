import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        
        // List to int array
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}