import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {
    static int N;
    static Queue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
    static Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        // 풀이
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (maxHeap.isEmpty() || maxHeap.peek() >= n) {
                maxHeap.offer(n);
            } else {
                minHeap.offer(n);
            }

            // size 조정
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            // 출력
            bw.write(maxHeap.peek() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}