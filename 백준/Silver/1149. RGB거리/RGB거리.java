import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int ans = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Integer.parseInt(arr[j]);
            }
        }

        // 풀이
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        min = Math.min(min, dp[i - 1][k]);
                    }
                }
                dp[i][j] += min;
            }
        }

        for (int i = 0; i < 3; i++) {
            ans = Math.min(ans, dp[N - 1][i]);
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}