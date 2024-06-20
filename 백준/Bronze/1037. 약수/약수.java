import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long answer = 0;

        if (N == 1) {
            answer = (long)Math.pow(Long.parseLong(br.readLine()), 2);
        } else {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Comparator.naturalOrder());

            answer = list.get(0) * list.get(list.size() - 1);
        }

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
