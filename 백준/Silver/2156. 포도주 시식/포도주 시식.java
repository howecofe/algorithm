import java.io.*;

class Main {

    static int N;
    static int[] wine, dp;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        wine = new int[N + 1];
        dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        dp[1] = wine[1];

        if (N >= 2) {
            dp[2] = wine[1] + wine[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
        }

        // 출력
        bw.write(dp[N] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}