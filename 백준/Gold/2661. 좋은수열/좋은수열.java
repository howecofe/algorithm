import java.io.*;

class Main {
    static int N;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        N = Integer.parseInt(br.readLine());

        // 풀이
        permutation(0, "");

        br.close();
    }

    static void permutation(int depth, String str) {
        if (depth == N) {
            System.out.println(str);
            System.exit(0);
        }

        for (int i = 1; i <= 3; i++) {
            if (check(str + i)) permutation(depth + 1, str + i);
        }

    }

    static boolean check(String s) {
        int len = s.length();
        int subLen = len / 2;

        // 끝에서부터 비교
        for (int i = 1; i <= subLen; i++) {
            String front = s.substring(len - 2 * i, len - i);
            String back = s.substring(len - i, len);
            if (front.equals(back)) return false;
        }
        return true;
    }

}