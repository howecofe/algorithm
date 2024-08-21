import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 풀이
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String op = br.readLine();

            switch (op) {
                case "pop":
                    if (q.isEmpty()) bw.write("-1\n");
                    else bw.write(q.poll() + "\n");
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if (q.isEmpty()) bw.write("-1\n");
                    else bw.write(q.peek() + "\n");
                    break;
                case "back":
                    if (q.isEmpty()) bw.write("-1\n");
                    else bw.write(q.peekLast() + "\n");
                    break;
                default:
                    String[] arr = op.split(" ");
                    q.offer(Integer.parseInt(arr[1]));
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}