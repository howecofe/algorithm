import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());
        int ans = 0;

        int[] A = new int[N];
        int[] B = new int[N];

        String[] sA = br.readLine().split(" ");
        String[] sB = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sA[i]);
            B[i] = Integer.parseInt(sB[i]);
        }

        // 풀이
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            ans += A[i] * B[N - 1 - i];
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }
}