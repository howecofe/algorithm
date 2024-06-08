import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");
        Arrays.sort(str, Comparator.reverseOrder());

        for (String s : str) {
            bw.write(s);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
