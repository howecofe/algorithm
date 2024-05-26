import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        String[] str = br.readLine().trim().split(" ");
        for (String s : str) {
            if (!s.isEmpty()) answer++;
        }

        bw.write("" + answer);
        bw.flush();
        bw.close();
    }
}