import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Long> list = new ArrayList<>();
        List<Long> diff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(br.readLine()));
        }

        // 거리 차이를 구한다.
        for (int i = 0; i < list.size() - 1; i++) {
            diff.add(list.get(i + 1) - list.get(i));
        }

        // 거리 차이의 최대 공약수를 구한다. => 가로수의 간격
        long gcd = diff.get(0);
        for (int i = 1; i < diff.size(); i++) {
            gcd = gcd(gcd, diff.get(i));
        }

        // 전체 가로수 수를 구한다.
        long total = (list.get(list.size() - 1) - list.get(0)) / gcd + 1;

        // 새로 심을 가로수 수 = 전체 가로수 수 - 현재 심어진 가로수 수
        bw.write(total - n + "");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) return b;

        return gcd(b, a % b);
    }

}
