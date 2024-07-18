import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
    static char res;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum == 0) res = 'D';
            else if (sum == 1) res = 'C';
            else if (sum == 2) res = 'B';
            else if (sum == 3) res = 'A';
            else if (sum == 4) res = 'E';

            bw.write(res + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}