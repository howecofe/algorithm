import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long answer = 0;

        for (int i = 0; i < T; i++) {
            long num = Long.parseLong(br.readLine());

            if (num <= 2) { answer = 2; }
            else {
                while (!isPrime(num)) { num++; }
                answer = num;
            }

            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
