import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int n, k;
//    static LinkedList<Integer> q = new LinkedList<>();
    static List<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        sb.append("<");

        // 풀이 1. Queue 사용
//        for (int i = 1; i <= n; i++) q.add(i);
//
//        while (true) {
//            if (q.size() == 1) {
//                sb.append(q.poll() + ">");
//                break;
//            }
//
//            // k - 1번 회전
//            for (int i = 0; i < k - 1; i++) {
//                q.add(q.poll()); // 첫번째 요소를 맨 마지막으로 이동
//            }
//
//            // k번째 요소 꺼내기
//            sb.append(q.poll() + ", ");
//        }

        // 풀이 2. List 사용
        for (int i = 1; i <= n; i++) list.add(i);
        int idx = 0;

        while (n > 0) {
            idx = (idx + (k - 1)) % n; // 인덱스 갱신
            int num = list.get(idx); // 요소 조회
            list.remove(idx); // 요소 삭제
            n--;

            if (n == 0) {
                sb.append(num + ">");
            } else {
                sb.append(num + ", ");
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}