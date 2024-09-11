import java.io.*;

class Main {

    static int N;
    static int[] step;
    static int[] dp;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        step = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        dp = new int[N + 1];
        dp[1] = step[1];
        if (N >= 2) {
            dp[2] = step[1] + step[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = step[i] + Math.max(dp[i - 2], dp[i - 3] + step[i - 1]);
        }

        // 출력
        bw.write(dp[N] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}