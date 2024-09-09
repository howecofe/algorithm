import java.io.*;

class Main {
    static int T;
    static int[] arr;
    static int[] dp0;
    static int[] dp1;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        T = Integer.parseInt(br.readLine());
        arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        dp0 = new int[41];
        dp1 = new int[41];

        dp0[0] = 1;
        dp1[0] = 0;
        dp0[1] = 0;
        dp1[1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp0[i] = dp0[i - 1] + dp0[i - 2];
            dp1[i] = dp1[i - 1] + dp1[i - 2];
        }

        // 출력
        for (int n : arr) {
            bw.write(dp0[n] + " " + dp1[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

}