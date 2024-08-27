import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        // 풀이
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);

        // 출력
        bw.write(gcd + "\n");
        bw.write(lcm + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;

        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}