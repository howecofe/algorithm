import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.equals("ENTER")) {
                answer += set.size();
                set.clear();
            } else {
                set.add(s);
            }
        }

        answer += set.size();

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
