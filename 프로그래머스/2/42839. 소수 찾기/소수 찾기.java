import java.util.*;

class Solution {
    // 1. DFS 사용 풀이
//     static Set<Integer> set = new HashSet<>();
//     static boolean[] visited = new boolean[7];
    
//     public int solution(String numbers) {
//         int answer = 0;
        
//         dfs(numbers, "", 1);
        
//         for (int n : set) {
//             if (isPrime(n)) { answer++; }
//         }
        
//         return answer;
//     }
    
//     private static void dfs(String numbers, String tmp, int depth) {
//         if (depth > numbers.length()) { return; }

//         for (int i = 0; i < numbers.length(); i++) {
//             if (!visited[i]) {
//                 visited[i] = true;
//                 set.add(Integer.parseInt(tmp + numbers.charAt(i)));
//                 dfs(numbers, tmp + numbers.charAt(i), depth + 1);
//                 visited[i] = false;
//             }
//         }
//     }

    // 2. 카운트 배열 사용 풀이
    public int solution(String numbers) {
        int answer = 0;
        int[] nums = new int[10];
        
        for (String s : numbers.split("")) {
            nums[Integer.parseInt(s)]++; // 카운트 배열
        }
        
        for (int i = 2; i <= 9999999; i++) {
            int[] newArr = nums.clone(); // 카운트 배열 복사가 핵심.
            int target = i;
            boolean isContain = true; // 종이 조각을 붙여 만들 수 있는 수인지 확인하는 변수
            
            while (target > 0) {
                if (newArr[target % 10] == 0) {
                    isContain = false;
                    break;
                }
                
                newArr[target % 10]--;
                target /= 10;
            }
            
            if (isContain && isPrime(i)) { answer++; }
        }
        
        return answer;
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) { return false; }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}