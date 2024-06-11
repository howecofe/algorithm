import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            long answer = isPrime(Long.parseLong(br.readLine()));
            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static long isPrime(long n) {
        if (n <= 2) return 2;
        boolean isPrime = false;

        while (!isPrime) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            n++;
        }

        return n - 1;
    }

}
