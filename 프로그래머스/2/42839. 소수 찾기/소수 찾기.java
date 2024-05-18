import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        
        dfs(numbers, "", 1);
        
        for (int n : set) {
            if (isPrime(n)) { answer++; }
        }
        
        return answer;
    }
    
    private static void dfs(String numbers, String tmp, int depth) {
        if (depth > numbers.length()) { return; }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(tmp + numbers.charAt(i)));
                dfs(numbers, tmp + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
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