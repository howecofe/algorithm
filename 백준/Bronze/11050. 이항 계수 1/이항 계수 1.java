import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;

        // 이항 계수
        // (0 <= k <= n) -> n! / k!(n-k)!
        // (k < 0 || k > n) -> 0

        if (0 <= k && k <= n) {
            answer = factorial(n) / (factorial(k) * factorial(n - k));
        } else {
            answer = 0;
        }

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static int factorial(int n) {
        if (n == 0) return 1;

        int res = 1;
        while (n > 0) {
            res *= n--;
        }

        return res;
    }
}
