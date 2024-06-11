import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) cnt++;
            }
            bw.write(cnt + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
