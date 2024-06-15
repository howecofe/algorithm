import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        LinkedList<Long> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            long val = Long.parseLong(st2.nextToken());

            // Queue 만 고려
            if (st1.nextToken().equals("0")) {
                q.add(val);
            }
        }

        for (int i = 0; i < m; i++) { // 수열 순회
            q.addFirst(Long.parseLong(st3.nextToken()));
            bw.write(q.pollLast() + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
