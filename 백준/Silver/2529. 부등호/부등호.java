import java.io.*;

class Main {
    static int size;
    static String min, max;
    static boolean[] visited = new boolean[10];
    static String[] signs;

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int k = Integer.parseInt(br.readLine());
        signs = br.readLine().split(" ");

        // 풀이
        size = k + 1;
        min = "9".repeat(10);
        max = "0".repeat(10);

        dfs(0, "");


        // 출력
        bw.write(max + "\n" + min);

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int depth, String num) {
        if (depth == size) {
            min = Long.parseLong(min) > Long.parseLong(num) ? num : min;
            max = Long.parseLong(max) < Long.parseLong(num) ? num : max;
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (visited[i]) continue;

            if (depth > 0 && !check(num.charAt(depth - 1) - '0', i, signs[depth - 1])) continue;

            visited[i] = true;
            dfs (depth + 1, num + i);
            visited[i] = false;
        }
    }

    static boolean check(int n1, int n2, String sign) {
        if ((sign.equals("<") && n1 > n2) || (sign.equals(">") && n1 < n2)) return false;

        return true;
    }

}