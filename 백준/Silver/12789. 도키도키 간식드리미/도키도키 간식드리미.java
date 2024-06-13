import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String answer = "Nice";
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) { q.add(Integer.parseInt(st.nextToken())); }

        int order = 1;

        while (order <= n) {
            // 공간A 탐색
            if (!q.isEmpty()) {
                if (q.peek() == order) { // 공간A 첫번째 사람이 현재 순서인 경우
                    q.poll();
                    order++;
                } else { // 공간A 첫번째 사람이 현재 순서가 아닌 경우 -> 공간B 탐색
                    if (!stk.isEmpty() && stk.peek() == order) { // 공간B 첫번째 사람이 현재 순서인 경우
                        stk.pop();
                        order++;
                    } else { // 공간B에 사람이 없거나, 첫번째 사람이 현재 순서가 아닌 경우 -> A에서 빼서 B에 넣는다.
                        int num = q.poll();
                        stk.add(num);
                    }
                }
            } else { // 공간A 사람이 없는 경우 -> 공간B 탐색
                if (!stk.isEmpty() && stk.peek() == order) { // 공간B 첫번째 사람이 현재 순서인 경우
                    stk.pop();
                    order++;
                } else { // 공간B에 사람이 없거나, 첫번째 사람이 현재 순서가 아닌 경우 -> 간식 받을 수 없다! 반복문 빠져나온다.
                    answer = "Sad";
                    break;
                }
            }
        }

        bw.write(answer + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
