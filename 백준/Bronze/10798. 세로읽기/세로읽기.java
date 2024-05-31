import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            int idx = 0;

            for (String s : str.split("")) { arr[i][idx++] = s; }
        }

        br.close();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] != null) {
                    answer += arr[j][i];
                }
            }
        }

        System.out.println(answer);
    }
}