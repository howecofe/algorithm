import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {

    static int N, ans;
    static List<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());

        // 풀이
        // N 이하의 소수 리스트 구성
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) primeList.add(i);
        }

        for (int i = 0; i < primeList.size(); i++) {
            int sum = 0;
            for (int j = i; j < primeList.size(); j++) {
                sum += primeList.get(j);
                if (sum == N) {
                    ans++;
                    break;
                } else if (sum > N) {
                    break;
                }
            }
        }

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}