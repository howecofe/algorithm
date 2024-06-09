import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int sugar = 0;
        int cnt = 0;

        // only 5kg
        if (n % 5 == 0) list.add(n / 5);
        else {
            // 5kg -> 3kg
            for (int i = 1; i <= n / 5; i++) {
                sugar = n;
                cnt = i;
                sugar -= 5 * i;

                if (sugar % 3 == 0) {
                    cnt += sugar / 3;
                    list.add(cnt);
                }
            }
        }

        // only 3kg
        if (n % 3 == 0) list.add(n / 3);
        else {
            // 3kg -> 5kg
            for (int i = 1; i <= n /3; i++) {
                sugar = n;
                cnt = i;
                sugar -= 3 * i;

                if (sugar % 5 == 0) {
                    cnt += sugar / 5;
                    list.add(cnt);
                }
            }
        }

        list.sort(Comparator.naturalOrder());

        int answer = list.isEmpty() ? -1 : list.get(0);

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
