import java.io.*;

class Main {

    static int n, ans;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 풀이
        dp = new int[n];
        dp[0] = arr[0];
        ans = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            ans = Math.max(ans, dp[i]);
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}