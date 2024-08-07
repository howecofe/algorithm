import java.util.*;

class Solution {
    // 1. BFS
//     static int ans;
//     static Queue<Word> q = new LinkedList<>();
//     static boolean[] visited;
//     static class Word {
//         String w;
//         int c;
//         Word(String w, int c) {
//             this.w = w;
//             this.c = c;
//         }
//     }

//     public int solution(String begin, String target, String[] words) {
//         visited = new boolean[words.length];

//         // target 단어가 없는 경우
//         boolean exists = false;
//         for (String w : words) {
//             if (w.equals(target)) {
//                 exists = true;
//                 break;
//             }
//         }
//         if (!exists) return 0;

//         q.offer(new Word(begin, 0));
//         bfs(words, target);

//         if (ans == 0) return 0; // 바꿀 수 없는 경우

//         return ans;
//     }

//     static void bfs(String[] words, String target) {

//         while (!q.isEmpty()) {
//             Word word = q.poll();
//             String before = word.w;
//             int cost = word.c;

//             for (int i = 0; i < words.length; i++) {
//                 if (visited[i]) continue;

//                 // 바꿀 수 있는지 단어인지 판별
//                 String after = words[i];
//                 int diffCnt = 0;
//                 boolean changable = true;
//                 for (int j = 0; j < before.length(); j++) {
//                     if (before.charAt(j) != after.charAt(j)) diffCnt++;
//                     if (diffCnt > 1) {
//                         changable = false;
//                         break;
//                     }
//                 }

//                 if (!changable) continue;

//                 // 바꿀 수 있는 경우
//                 // target 단어인지 체크
//                 if (after.equals(target)) {
//                     ans = cost + 1;
//                     return;
//                 }
//                 q.offer(new Word(after, cost + 1));
//                 visited[i] = true;
//             }
//         }
//     }
    
    // 2. DFS
    static int ans = Integer.MAX_VALUE;
    static boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        // target 단어가 없는 경우
        boolean exists = false;
        for (String w : words) {
            if (w.equals(target)) {
                exists = true;
                break;
            }
        }
        if (!exists) return 0;

        dfs(words, target, begin, 0);

        if (ans == Integer.MAX_VALUE) return 0; // 바꿀 수 없는 경우

        return ans;
    }

    static void dfs(String[] words, String target, String before, int cnt) {

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;

            // 바꿀 수 있는 단어인지 판별
            int diffCnt = 0;
            boolean changable = true;
            String after = words[i];
            for (int j = 0; j < before.length(); j++) {
                if (before.charAt(j) != after.charAt(j)) diffCnt++;
                if (diffCnt > 1) {
                    changable = false;
                    break;
                }
            }
            if (!changable) continue;

            // 바꿀 수 있는 경우
            if (after.equals(target)) ans = Math.min(ans, cnt + 1); // target 단어 체크
            visited[i] = true;
            dfs(words, target, after, cnt + 1);
            visited[i] = false;
        }

    }
}