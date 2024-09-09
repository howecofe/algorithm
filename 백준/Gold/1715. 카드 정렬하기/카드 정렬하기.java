import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
    static int N, ans;
    static Queue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        // 풀이
        while (pq.size() > 1) {
            int n1 = pq.poll();
            int n2 = pq.poll();
            ans += n1 + n2;
            pq.offer(n1 + n2);
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}