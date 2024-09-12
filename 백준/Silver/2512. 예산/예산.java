import java.io.*;

class Main {

    static int N, M;
    static int[] budget;
    static int start, end, mid;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(br.readLine());
        budget = new int[N];

        for (int i = 0; i < N; i++) {
            budget[i] = Integer.parseInt(input[i]);
            end = Math.max(end, budget[i]);
        }

        // 풀이
        while (start <= end) {
            mid = (start + end) / 2;
            int sum = 0;
            boolean overflow = false;

            for (int i = 0; i < N; i++) {
                if (budget[i] <= mid) {
                    sum += budget[i];
                } else {
                    sum += mid;
                }

                if (sum > M) {
                    overflow = true;
                    break;
                }
            }

            if (overflow) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // 출력
        bw.write(end + "");

        br.close();
        bw.flush();
        bw.close();
    }

}