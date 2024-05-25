import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        
        while (s != null) {
            String[] nums = s.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int sum = a + b;

            bw.write(sum + "\n");
            s = br.readLine();
        }

        bw.flush();
        bw.close();
    }
}