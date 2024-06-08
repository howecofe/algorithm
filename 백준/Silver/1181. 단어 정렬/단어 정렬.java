import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        list.sort((o1, o2) -> {
            int result = Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
            if (result == 0) {
                return o1.compareTo(o2);
            } else {
                return result;
            }
        });

        String prev = "";
        for (String s : list) {
            if (s.equals(prev)) { continue; }

            bw.write(s + "\n");
            prev = s;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
