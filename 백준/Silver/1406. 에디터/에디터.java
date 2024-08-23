import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String str = br.readLine();
        int cnt = Integer.parseInt(br.readLine());

        // 풀이
        Deque<String> leftStk = new ArrayDeque<>();
        Deque<String> rightStk = new ArrayDeque<>();
        for (String s : str.split("")) leftStk.push(s);

        for (int i = 0; i < cnt; i++) {
            String cmd = br.readLine();

            switch (cmd) {
                case "L":
                    if (!leftStk.isEmpty()) rightStk.push(leftStk.pop());
                    break;
                case "D":
                    if (!rightStk.isEmpty()) leftStk.push(rightStk.pop());
                    break;
                case "B":
                    if (!leftStk.isEmpty()) leftStk.pop();
                    break;
                default:
                    String val = cmd.split(" ")[1];
                    leftStk.push(val);
            }
        }

        while (!rightStk.isEmpty()) {
            leftStk.push(rightStk.pop());
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (String s : leftStk) sb.append(s);
        bw.write(sb.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }
}