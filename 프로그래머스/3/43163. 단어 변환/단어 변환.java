import java.util.*;

class Solution {
    static int ans;
    static Queue<Word> q = new LinkedList<>();
    static boolean[] visited;
    static class Word {
        String w;
        int c;
        Word(String w, int c) {
            this.w = w;
            this.c = c;
        }
    }

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

        q.offer(new Word(begin, 0));
        bfs(words, target);

        if (ans == 0) return 0; // 바꿀 수 없는 경우

        return ans;
    }

    static void bfs(String[] words, String target) {

        while (!q.isEmpty()) {
            Word word = q.poll();
            String before = word.w;
            int cost = word.c;

            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;

                // 바꿀 수 있는지 단어인지 판별
                String after = words[i];
                int diffCnt = 0;
                boolean changable = true;
                for (int j = 0; j < before.length(); j++) {
                    if (before.charAt(j) != after.charAt(j)) diffCnt++;
                    if (diffCnt > 1) {
                        changable = false;
                        break;
                    }
                }

                if (!changable) continue;

                // 바꿀 수 있는 경우
                // target 단어인지 체크
                if (after.equals(target)) {
                    ans = cost + 1;
                    return;
                }
                q.offer(new Word(after, cost + 1));
                visited[i] = true;
            }
        }
    }
}