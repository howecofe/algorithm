import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // 위쪽 (1 ~ n번째 줄)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + n - 1; j++) {
                if (i + j < n + 1) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }

        // 아래쪽 (n+1 ~ 2*n-1번째 줄)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i + n - 1; j++) {
                if (i + j < n + 1) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
