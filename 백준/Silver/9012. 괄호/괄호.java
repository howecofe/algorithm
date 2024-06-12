import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<String> stk = new Stack<>();
            String[] arr = br.readLine().split("");
            String answer = "YES";

            for (int j = 0; j < arr.length; j++) {
                String s = arr[j];
                if (s.equals("(")) { stk.add(s); }
                else if (s.equals(")")) {
                    if (!stk.isEmpty()) stk.pop();
                    else {
                        answer = "NO";
                        break;
                    }
                }
            }

            if (!stk.isEmpty()) answer = "NO";

            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
