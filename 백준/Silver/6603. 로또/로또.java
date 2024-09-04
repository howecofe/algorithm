import java.io.*;
import java.util.Arrays;

class Main {
    static int[] tgt = new int[6];
    static int[] src;
    static int k;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 입력
            String s = br.readLine();
            if (s.equals("0")) break;

            String[] input = s.split(" ");
            k = Integer.parseInt(input[0]);
            src = new int[k];

            for (int i = 1; i <= k; i++) {
                src[i - 1] = Integer.parseInt(input[i]);
            }

            // 풀이
            Arrays.sort(src);
            comb(0, 0);

            System.out.println();
        }

        br.close();
    }

    static void comb(int tgtIdx, int srcIdx) {
        if (tgtIdx == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(tgt[i] + " ");
            }
            System.out.println(sb.toString());
            return;
        }

        if (srcIdx == k) return;

        tgt[tgtIdx] = src[srcIdx];

        comb(tgtIdx + 1, srcIdx + 1);
        comb(tgtIdx, srcIdx + 1);
    }

}