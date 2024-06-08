import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        List<Long> cards = new ArrayList<>();
        List<Long> sumList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < cards.size() - 2; i++) {
            for (int j = i + 1; j < cards.size() - 1; j++) {
                for (int k = j + 1; k < cards.size(); k++) {
                    long sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum <= m) {
                        sumList.add(sum);
                    }
                }
            }
        }

        sumList.sort(Comparator.reverseOrder());
        bw.write(sumList.get(0) + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
