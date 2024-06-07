import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Long> set = new TreeSet<>();
        long n = Long.parseLong(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(Long.parseLong(br.readLine()));
        }

        Iterator<Long> it = set.iterator();

        while (it.hasNext()) {
            bw.write(String.valueOf(it.next()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}