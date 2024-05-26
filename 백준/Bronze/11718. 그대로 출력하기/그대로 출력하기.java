import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";

        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}