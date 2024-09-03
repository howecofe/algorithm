import java.io.*;


class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        int[] dp = new int[k + 1];
        dp[0] = 1;

        // 동전을 하나씩 탐색하면서 dp[1~k] 경우의 수 갱신
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                // 현재 탐색 중인 동전이 k원보다 작으면, 현재 동전으로 k원을 만들 수 없으므로(= 경우의 수 0) 갱신할 필요 X -> 고려 X
                if (j >= coin[i]) {
                    dp[j] += dp[j - coin[i]];
                }
            }
        }

        // 출력
        bw.write(dp[k] + "");

        br.close();
        bw.flush();
        bw.close();
    }

}