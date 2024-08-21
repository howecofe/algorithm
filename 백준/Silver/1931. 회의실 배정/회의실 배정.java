import java.io.*;
import java.util.*;

class Main {
    static int N, ans;
    static Queue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]); // 끝나는 시간 -> 시작 시간 오름차순 정렬
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] time = br.readLine().split(" ");
            int start = Integer.parseInt(time[0]);
            int end = Integer.parseInt(time[1]);
            q.offer(new int[]{start, end});
        }

        // 풀이
        int curr = q.poll()[1];
        ans++;

        while (!q.isEmpty()) {
            int[] time = q.poll();
            int start = time[0];
            int end= time[1];

            if (curr <= start) {
                ans++;
                curr = end;
            }
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }
}