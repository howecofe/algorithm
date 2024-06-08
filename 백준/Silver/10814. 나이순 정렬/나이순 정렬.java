import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine().split(" "));
        }

        list.sort((o1, o2) -> Integer.valueOf(o1[0]).compareTo(Integer.valueOf(o2[0])));

        for (String[] s : list) {
            bw.write(s[0] + " " + s[1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
