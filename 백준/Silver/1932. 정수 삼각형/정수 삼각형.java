import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 1][n + 1]; // 0 dummy
        int[][] dp = new int[n + 1][n + 1]; // 0 dummy

        for (int i = 1; i <= n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                map[i][j + 1] = Integer.parseInt(arr[j]);
            }
        }

        // 풀이
        int ans = 0;

        dp[1][1] = map[1][1];

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    dp[i][j] = map[i][j] + dp[i - 1][j];
                } else if (j == i) {
                    dp[i][j] = map[i][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = map[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[n][i]);
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}