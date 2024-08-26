import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int T = Integer.parseInt(br.readLine());

        // 풀이
        for (int i = 0; i < T; i++) {
            String[] tmp = br.readLine().split(" ");
            int N = Integer.parseInt(tmp[0]);
            String M = tmp[1];
            String[] arr = br.readLine().split(" ");

            LinkedList<String> idxQ = new LinkedList<>();
            LinkedList<String> srcQ = new LinkedList<>();
            int cnt = 0;

            for (int j = 0; j < N; j++) idxQ.offer(String.valueOf(j));
            for (int j = 0; j < N; j++) srcQ.offer(arr[j]);

            Arrays.sort(arr);

            for (int j = arr.length - 1; j >= 0; j--) {
                String max = arr[j];
                boolean answerFound = false;

                while (true) {
                    String src = srcQ.poll();
                    String idx = idxQ.poll();

                    if (src.equals(max)) {
                        cnt++;
                        if (idx.equals(M)) answerFound = true;
                        break;
                    }

                    srcQ.offer(src);
                    idxQ.offer(idx);
                }

                if (answerFound) {
                    bw.write(cnt + "\n");
                    break;
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}