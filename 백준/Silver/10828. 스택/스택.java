import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stk = new ArrayDeque<>();

        // 풀이
        for (int i = 0; i < N; i++) {
            String op = br.readLine();
            if (op.equals("pop")) {
                if (stk.isEmpty()) bw.write("-1\n");
                else bw.write(stk.pop() + "\n");
            } else if (op.equals("size")) {
                bw.write(stk.size() + "\n");
            } else if (op.equals("empty")) {
                if (stk.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            } else if (op.equals("top")) {
                if (stk.isEmpty()) bw.write("-1\n");
                else bw.write(stk.peek() + "\n");
            } else {
                String[] arr = op.split(" ");
                stk.push(Integer.parseInt(arr[1]));
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}