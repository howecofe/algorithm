import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        Stack<Long> stk = new Stack<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            long n = Long.parseLong(br.readLine());
            if (n == 0) {
                long val = stk.peek();
                if (!stk.isEmpty()) stk.pop();
                sum -= val;
            } else {
                stk.add(n);
                sum += n;
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
