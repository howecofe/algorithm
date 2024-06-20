import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(factorial(n) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static int factorial(int n) {
        if (n == 0) return 1;

        int res = 1;
        while (n > 0) {
            res *= n--;
        }

        return res;
    }

}
