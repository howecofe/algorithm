// import java.util.*;

class Solution {
    public int solution(int num, int k) {
//         int answer = -1;
//         List<Integer> list = new ArrayList<>();
        
//         while (num != 0) {
//             list.add(num % 10);
//             num /= 10;
//         }
        
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) == k) {
//                 answer = list.size() - i;
//             }
//         }
        
//         return answer;
        return ("-" + num).indexOf(String.valueOf(k));
    }
}