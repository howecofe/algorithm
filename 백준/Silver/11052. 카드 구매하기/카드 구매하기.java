import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());
        String[] P = br.readLine().split(" ");

        int[] cards = new int[N + 1]; // 0 dummy
        for (int i = 1; i <= N; i++) cards[i] = Integer.parseInt(P[i - 1]);

        // 풀이
        int[] dp = new int[N + 1]; // 0 dummy
        for (int i = 1; i <= N; i++) dp[i] = cards[i];

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
            }
        }

        // 출력
        bw.write(dp[N] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}