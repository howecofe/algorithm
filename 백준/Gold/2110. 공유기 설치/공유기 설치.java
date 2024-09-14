import java.io.*;
import java.util.Arrays;

class Main {
    static int N, C;
    static int[] home;
    static int start, end, mid;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        C = Integer.parseInt(input[1]);
        home = new int[N];

        for (int i = 0; i < N; i++) {
            home[i] = Integer.parseInt(br.readLine());
        }

        // 풀이
        Arrays.sort(home);
        end = home[N - 1];

        while (start <= end) {
            mid = (start + end) / 2;

            int cnt = 1;
            int lastLoc = home[0];
            for (int i = 1; i < N; i++) {
                if (home[i] - lastLoc >= mid) {
                    cnt++;
                    lastLoc = home[i];
                }
            }

            if (cnt < C) {
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