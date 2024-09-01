import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 풀이
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                pq.offer(n);
                continue;
            }

            if (!pq.isEmpty()) bw.write(pq.poll() + "\n");
            else bw.write(0 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}