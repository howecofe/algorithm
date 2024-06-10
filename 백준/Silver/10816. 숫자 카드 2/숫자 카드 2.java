import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Long> map = new HashMap<>();

        for (long i = 0; i < n; i++) {
            String s = st.nextToken();
            map.put(s, map.getOrDefault(s, 0L) + 1);
        }

        long m = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (long i = 0; i < m; i++) {
            String input = st.nextToken();
            long answer = map.get(input) == null ? 0 : map.get(input);
            bw.write(answer + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
