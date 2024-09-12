import java.io.*;

class Main {

    static int N;
    static long ans;
    static int[] roadLen;
    static int[] oilCost;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());
        roadLen = new int[N - 1];
        oilCost = new int[N - 1];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            roadLen[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        for (int i = 0; i < N - 1; i++) {
            oilCost[i] = Integer.parseInt(input[i]);
        }

        // 풀이
        int idx = 0;
        long roadLength = roadLen[0];

        for (int i = 1; i < N - 1; i++) {
            if (oilCost[idx] <= oilCost[i]) {
                roadLength += roadLen[i];
                continue;
            }

            ans += oilCost[idx] * roadLength;
            roadLength = roadLen[i];
            idx = i;
        }

        ans += oilCost[idx] * roadLength;

        // 출력
        bw.write(ans + "");

        br.close();
        bw.flush();
        bw.close();
    }

}