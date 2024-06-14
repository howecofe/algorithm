import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> dq = new LinkedList<>();
        long n = Long.parseLong(br.readLine());

        for (long i = 0; i < n; i++) {
            String cmd = br.readLine();
            int x = 0;
            int answer = 0;

            if (cmd.contains("1") || cmd.contains("2")) {
                StringTokenizer st = new StringTokenizer(cmd);
                cmd = st.nextToken();
                x = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "1" :
                    dq.addFirst(x);
                    break;
                case "2" :
                    dq.addLast(x);
                    break;
                case "3" :
                    answer = dq.isEmpty() ? -1 : dq.pollFirst();
                    break;
                case "4" :
                    answer = dq.isEmpty() ? -1 : dq.pollLast();
                    break;
                case "5" :
                    answer = dq.size();
                    break;
                case "6" :
                    answer = dq.isEmpty() ? 1 : 0;
                    break;
                case "7" :
                    answer = dq.isEmpty() ? -1 : dq.peekFirst();
                    break;
                case "8" :
                    answer = dq.isEmpty() ? -1 : dq.peekLast();
                    break;
            }

            if (!cmd.equals("1") && !cmd.equals("2")) {
                bw.write(answer + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
