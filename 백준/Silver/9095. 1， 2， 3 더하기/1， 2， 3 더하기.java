import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int T = Integer.parseInt(br.readLine());

        // 풀이
        int[] dp = new int[11]; // 0 dummy
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // 출력
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}