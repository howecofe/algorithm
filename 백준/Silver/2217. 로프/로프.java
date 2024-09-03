import java.io.*;
import java.util.Arrays;

class Main {
    static int N, ans;
    static int[] ropes;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        ropes = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        Arrays.sort(ropes);
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, ropes[i] * (N - i));
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}