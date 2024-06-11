import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long m = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
