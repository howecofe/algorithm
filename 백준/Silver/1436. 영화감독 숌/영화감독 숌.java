import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long num = 665;
        int cnt = 0;

        while (cnt < n) {
            num++;
            if (String.valueOf(num).contains("666")) { cnt++; }
        }

        bw.write(num + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
