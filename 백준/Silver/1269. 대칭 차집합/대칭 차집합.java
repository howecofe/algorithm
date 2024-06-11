import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            String s = st.nextToken();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            String s = st.nextToken();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int commonCnt = 0;
        for (Integer n : map.values()) {
            if (n == 2) commonCnt++;
        }

        bw.write(a + b - commonCnt * 2 + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
