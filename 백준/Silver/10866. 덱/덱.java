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
        LinkedList<Integer> dq = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            String op = arr[0];
            
            switch (op) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(arr[1]));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(arr[1]));
                    break;
                case "pop_front":
                    if (dq.isEmpty()) bw.write("-1\n");
                    else bw.write(dq.pollFirst() + "\n");
                    break;
                case "pop_back":
                    if (dq.isEmpty()) bw.write("-1\n");
                    else bw.write(dq.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    if (dq.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if (dq.isEmpty()) bw.write("-1\n");
                    else bw.write(dq.peekFirst() +  "\n");
                    break;
                case "back":
                    if (dq.isEmpty()) bw.write("-1\n");
                    else bw.write(dq.peekLast() +  "\n");
                    break;
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }
}