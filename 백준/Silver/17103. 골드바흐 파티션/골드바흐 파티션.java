import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int max = 1000000;

        // 에라토스테네스의 체 : 어떤 수 N이 소수이면, N의 배수는 소수가 아니다.
        // 큰 수의 소수를 판별하는 경우 에라토스테네스의 체 방식으로 처리하는 것이 더 효율적이다.
        
        // 1. 소수인지 판별할 리스트를 만든다.
        List<Boolean> primeList = new ArrayList<>();

        // 2. 0, 1은 false, 2 이상은 true로 채운다.
        primeList.add(false);
        primeList.add(false);
        for (int j = 2; j <= max; j++) primeList.add(true);

        // 3. 2부터 시작하여 해당 수가 true이고 소수이면 그 배수들을 false로 만든다.
        for (int j = 2; j <= max; j++) {
            if (primeList.get(j) && isPrime(j)) {
                for (int k = j * 2; k <= max; k += j) primeList.set(k, false);
            }
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int answer = 0;

            // n은 2보다 큰 짝수이고, n = 2 + X 이면 X는 무조건 짝수(2의 배수)라 소수가 아니므로 고려하지 않아도 된다. 단, 4는 2 + 2 이므로 예외로 처리한다.
            if (n == 4) { answer = 1; } // n = 2 + 2
            else {
                // 3 ~ n/2 사이의 홀수 확인
                for (int j = 3; j <= n / 2; j += 2) {
                    if (primeList.get(j) && primeList.get(n - j)) answer++;
                }
            }

            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
