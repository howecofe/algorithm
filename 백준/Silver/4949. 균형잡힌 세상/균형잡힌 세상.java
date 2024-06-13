import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        List<String> list = new ArrayList<>(Arrays.asList("(", ")", "[", "]"));

        while (!(s = br.readLine()).equals(".")) {
            String[] arr = s.split("");
            Stack<String> stk = new Stack<>();
            String answer = "yes";
            String symbol = "";

            for (String str : arr) {
                if (!list.contains(str)) continue;

                if (str.equals("(") || str.equals("[")) {
                    stk.add(str);
                    continue;
                }

                if (str.equals(")")) symbol = "(";
                else if (str.equals("]")) symbol = "[";

                if (!stk.isEmpty() && stk.peek().equals(symbol)) { stk.pop(); }
                else {
                    answer = "no";
                    break;
                }
            }

            if (!stk.isEmpty()) answer = "no";

            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
