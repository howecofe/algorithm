import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        Stack<Integer> stk = new Stack<>();
        int val = 0;

        for (long i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                stk.add(Integer.parseInt(st.nextToken()));
                continue;
            } else if (cmd == 2) {
                if (!stk.isEmpty()) { val = stk.pop(); }
                else { val = -1; }
            } else if (cmd == 3) {
                val = stk.size();
            } else if (cmd == 4) {
                val = stk.isEmpty() ? 1 : 0;
            } else if (cmd == 5) {
                if (!stk.isEmpty()) { val = stk.peek();}
                else { val = -1; }
            }

            bw.write(val + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
