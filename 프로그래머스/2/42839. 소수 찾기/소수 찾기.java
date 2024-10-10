import java.util.*;

class Solution {
    
    // 1. dfs 풀이
    static char[] arr;
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        visited = new boolean[arr.length];
        
        dfs(0, "");
        
        for (int n : set) {
            if (isPrime(n)) answer++;
        }
        
        return answer;
    }
    
    static void dfs(int depth, String s) {
        if (depth == arr.length) return;
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            
            set.add(Integer.parseInt(s + arr[i]));
            visited[i] = true;
            
            dfs(depth + 1, s + arr[i]);
            
            visited[i] = false;
        }
    }
    
    // 2. 카운트 배열 풀이
//     public int solution(String numbers) {
//         int answer = 0;
//         char[] arr = numbers.toCharArray();
//         int[] cntArr = new int[10]; // 0 ~ 9
        
//         for (char c : arr) cntArr[c - '0']++;
        
//         for (int i = 1; i <= 9999999; i++) {
//             int n = i;
//             int[] copied = Arrays.copyOf(cntArr, 10);
//             boolean canMake = true;
            
//             while (n > 0) {
//                 if (copied[n % 10] == 0) {
//                     canMake = false;
//                     break;
//                 }
                
//                 copied[n % 10]--;
//                 n /= 10;
//             }
            
//             if (canMake && isPrime(i)) answer++; 
//         }
        
//         return answer;
//     }
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
}