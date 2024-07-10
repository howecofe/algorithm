import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while ((s = br.readLine()) != null) {
            String[] arr = s.split(" ");
            int res = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(res + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}