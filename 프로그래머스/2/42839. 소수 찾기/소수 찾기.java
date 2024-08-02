import java.util.*;

class Solution {
    // 1. DFS 사용 풀이
//     static boolean[] visited;
//     static char[] nums;
//     static Set<Integer> set = new HashSet<>();
//     static int cnt;
        
//     public static int solution(String numbers) {
//         nums = numbers.toCharArray();
//         visited = new boolean[nums.length];

//         // 가능한 조합 구하기
//         dfs(0, "");

//         // 소수 판별
//         for (int n : set) {
//             if (isPrime(n)) cnt++;
//         }

//         return cnt;
//     }

//     static void dfs(int depth, String s) {
//         // 기저조건
//         if (depth == nums.length) return;

//         for (int i = 0; i < nums.length; i++) {
//             // 방문 여부 체크
//             if (visited[i]) continue;

//             // set에 추가하고 방문 처리
//             set.add(Integer.parseInt(s + nums[i]));
//             visited[i] = true;

//             // 다음 방문 이어 나가기
//             dfs(depth + 1, s + nums[i]);

//             // 재귀호출로 리프노드까지 다녀온 후, 방문 처리 원복
//             visited[i] = false;
//         }
//     }

    // 2. 카운트 배열 사용 풀이
    public static int solution(String numbers) {
        int cnt = 0;

        // 0~9에 해당하는 자리의 수 카운트
        int[] cntArr = new int[10];
        for (int i = 0; i < numbers.length(); i++) {
            cntArr[numbers.charAt(i) - '0']++;
        }

        // numbers 범위는 1~9999999이므로, 만들 수 있는 수는 1~9999999
        for (int i = 1; i <= 9999999; i++) {
            // n의 각 자리 숫자가 카운트 배열에 있는지 확인하여 n을 만들 수 있는지 판별
            int n = i;
            int[] copied = Arrays.copyOf(cntArr, cntArr.length);
            boolean exists = true;

            while (n > 0) {
                // 카운트 배열에 없는 경우 break
                if (copied[n % 10] == 0) {
                    exists = false;
                    break;
                }

                copied[n % 10]--;
                n /= 10;
            }

            if (exists && isPrime(i)) cnt++;
        }

        return cnt;
    }
    
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}