import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
//         List<Integer> order = new ArrayList<>();
        
//         for (int i = 0; i < numbers.length; i += 2) {
//                 order.add(numbers[i]);
//         }
        
//         if (numbers.length % 2 == 1) {
//             for (int i = 1; i < numbers.length; i += 2) {
//                 order.add(numbers[i]);
//             }
//         }
        
//         return order.get((k - 1) % order.size());
        return numbers[(k - 1) * 2 % numbers.length];
    }
}