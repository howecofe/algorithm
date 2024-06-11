import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        long b1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long a2 = Long.parseLong(st.nextToken());
        long b2 = Long.parseLong(st.nextToken());

        // 1. 분모의 최소공배수를 구한다.
        long b3 = lcm(b1, b2);

        // 2. 분수의 합을 구한다. 분모 : 최소공배수, 분자 : (최소공배수 / 분모) * 분자 합
        long a3 = (b3 / b1) * a1 + (b3 / b2) * a2;

        // 3. 분자, 분모의 최대공약수로 각각을 나눈다. (기약분수)
        long gcd = gcd(a3, b3);
        a3 /= gcd;
        b3 /= gcd;

        bw.write(a3 + " " + b3);

        br.close();
        bw.flush();
        bw.close();
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) return b;

        return gcd(b, a % b);
    }
}
