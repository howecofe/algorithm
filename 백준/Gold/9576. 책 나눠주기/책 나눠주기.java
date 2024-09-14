import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
    static int T, N, M;
    static String[] input;
    static boolean[] soldout;
    static Queue<int[]> pq;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);

            pq = new PriorityQueue<>((o1, o2) -> o1[1] == o2[1]? o1[0] - o2[0] : o1[1] - o2[1]);
            soldout = new boolean[N + 1]; // 0 dummy
            int ans = 0;

            for (int j = 0; j < M; j++) {
                input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);

                pq.offer(new int[]{a, b});
            }

            while (!pq.isEmpty()) {
                int[] tmp = pq.poll();
                int a = tmp[0];
                int b = tmp[1];

                for (int j = a; j <= b; j++) {
                    if (soldout[j]) continue;
                    soldout[j] = true;
                    ans++;
                    break;
                }
            }

            bw.write(ans + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}