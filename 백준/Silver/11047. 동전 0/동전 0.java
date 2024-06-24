import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        // coin list 만들기 + 내림차순 정렬
        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin <= money) {
                list.add(0, coin); // 내림차순 만들기
            }
        }

        // 동전 최소 개수 구하기
        for (int coin : list) {
            if (money == 0) break;
            if (money < coin) continue;

            answer += money / coin;
            money %= coin;
        }

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}