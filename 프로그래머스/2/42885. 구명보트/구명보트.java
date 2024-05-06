import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 1. 반복문으로 풀기 -> 시간 초과
//         List<Integer> list = new ArrayList<>();
//         for (int p : people) { list.add(p); }
//         Collections.sort(list, Collections.reverseOrder());
//         
//         while (list.size() > 0) {
//             answer++;
//             int max = list.get(0);
//             list.remove(0);
            
//             for (int i = 0; i < list.size(); i++) {
//                 if (max + list.get(i) > limit) {
//                     continue;
//                 } else {
//                     list.remove(i);
//                     break;
//                 }
//             }
//         }
        
        // 2. 스택으로 풀기 -> 시간 초과
//         Stack<Integer> stack = new Stack<>();
//         while (list.size() > 0) {
//             boolean isSingle = true;
//             for (int i = 0; i < list.size(); i++) {
//                 if (stack.isEmpty()) {
//                     stack.push(list.get(i));
//                     list.remove(i);
//                     isSingle = false;
//                     break;
//                 } else {
//                     if (stack.peek() + list.get(i) <= limit) {
//                         answer++;
//                         stack.pop();
//                         list.remove(i);
//                         isSingle = false;
//                         break;
//                     }
//                 }
//             }
            
//             if (isSingle) {
//                 answer++;
//                 stack.pop();
//             }
//         }
        
//         if (!stack.isEmpty()) { answer++; }
          
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) {
            if (left == right) {
                answer++;
                break;
            }
            
            // if (left < right)
            if (people[left] + people[right] <= limit) {
                left++;
            }
            answer++;
            right--;
        }
        
        return answer;
        
    }
}