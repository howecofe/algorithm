import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            long num = i;
            long sum = num;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                answer = i;
                break;
            }
        }

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
