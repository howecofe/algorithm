import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());

        // 약수의 개수가 홀수면 창문이 열린 상태
        // -> 약수의 개수가 홀수인 수 : 제곱수
        // => 1 ~ n 사이의 제곱수 개수 구하기
        bw.write((long)Math.sqrt(n) + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
