import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayDeque<Integer> balloon = new ArrayDeque<>();
        ArrayDeque<Integer> paper = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            balloon.add(i + 1);
            paper.add(Integer.parseInt(st.nextToken()));
        }

        while (true) {
            bw.write(balloon.pop() + " ");

            int paperNum = paper.pop();

            if (balloon.isEmpty()) break;

            if (paperNum > 0) { // pop()을 먼저 하기 때문에 양수일 때는 paperNum - 1 만큼 오른쪽 회전
                for (int i = 0; i < paperNum - 1; i++) {
                    balloon.add(balloon.poll());
                    paper.add(paper.pop());
                }
            } else if (paperNum < 0) { // 음수일 때는 paperNum 만큼 왼쪽 회전
                for (int i = 0; i < Math.abs(paperNum); i++) {
                    balloon.addFirst(balloon.pollLast());
                    paper.addFirst(paper.pollLast());
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
