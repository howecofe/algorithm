import java.util.*;

class Solution {
    // 1. DFS 사용 풀이
    static boolean[] visited;
    static char[] nums;
    static Set<Integer> set = new HashSet<>();
    static int cnt;
        
    public static int solution(String numbers) {
        nums = numbers.toCharArray();
        visited = new boolean[nums.length];

        // 가능한 조합 구하기
        dfs(0, "");

        // 소수 판별
        for (int n : set) {
            if (isPrime(n)) cnt++;
        }

        return cnt;
    }

    static void dfs(int depth, String s) {
        // 기저조건
        if (depth == nums.length) return;

        for (int i = 0; i < nums.length; i++) {
            // 방문 여부 체크
            if (visited[i]) continue;

            // set에 추가하고 방문 처리
            set.add(Integer.parseInt(s + nums[i]));
            visited[i] = true;

            // 다음 방문 이어 나가기
            dfs(depth + 1, s + nums[i]);

            // 재귀호출로 리프노드까지 다녀온 후, 방문 처리 원복
            visited[i] = false;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    // 2. 카운트 배열 사용 풀이
//     public int solution(String numbers) {
//         int answer = 0;
//         int[] nums = new int[10];
        
//         for (String s : numbers.split("")) {
//             nums[Integer.parseInt(s)]++; // 카운트 배열
//         }
        
//         for (int i = 2; i <= 9999999; i++) {
//             int[] newArr = nums.clone(); // 카운트 배열 복사가 핵심.
//             int target = i;
//             boolean isContain = true; // 종이 조각을 붙여 만들 수 있는 수인지 확인하는 변수
            
//             while (target > 0) {
//                 if (newArr[target % 10] == 0) {
//                     isContain = false;
//                     break;
//                 }
                
//                 newArr[target % 10]--;
//                 target /= 10;
//             }
            
//             if (isContain && isPrime(i)) { answer++; }
//         }
        
//         return answer;
//     }
}