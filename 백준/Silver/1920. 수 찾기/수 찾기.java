import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        br.readLine();

        Map<String, Integer> map = new HashMap<>();
        for (String s : br.readLine().split(" ")) map.put(s, 0);

        br.readLine();

        // 풀이
        for (String s : br.readLine().split(" ")) {
            if (map.containsKey(s)) bw.write("1\n");
            else bw.write("0\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}