import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            int x = 0;
            int answer = 0;

            if (cmd.contains("push")) {
                StringTokenizer st = new StringTokenizer(cmd);
                cmd = st.nextToken();
                x = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "push":
                    q.add(x);
                    break;
                case "pop":
                    answer = q.isEmpty() ? -1 : q.poll();
                    break;
                case "size":
                    answer = q.size();
                    break;
                case "empty":
                    answer = q.isEmpty() ? 1 : 0;
                    break;
                case "front":
                    answer = q.isEmpty() ? -1 : q.peek();
                    break;
                case "back":
                    answer = q.isEmpty() ? -1 : q.peekLast();
                    break;
            }

            if (!cmd.equals("push")) {
                bw.write(answer + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
