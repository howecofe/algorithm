import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        LinkedList<Long> q = new LinkedList<>();

        for (long i = 1; i <= n; i++) { q.add(i); }

        while (q.size() > 1) {
            q.poll();

            if (q.size() == 1) break;

            long card = q.poll();
            q.add(card);
        }

        bw.write(q.peek() + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
