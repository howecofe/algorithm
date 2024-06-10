import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s;
            map.put(s, i + 1);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (input.replaceAll("[0-9]", "").isEmpty()) {
                bw.write(arr[Integer.parseInt(input) - 1] + "\n");
            } else {
                bw.write(map.get(input) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
