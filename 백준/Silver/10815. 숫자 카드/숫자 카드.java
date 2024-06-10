import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Long> set = new HashSet<>();
        for (long i = 0; i < n; i++) {
            set.add(Long.parseLong(st.nextToken()));
        }

        long m = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (long i = 0; i < m; i++) {
            if (set.contains(Long.parseLong(st.nextToken()))) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
