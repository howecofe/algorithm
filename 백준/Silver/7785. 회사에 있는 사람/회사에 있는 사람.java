import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (long i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        for (String key : map.keySet()) {
            if (map.get(key).equals("enter")) list.add(key);
        }

        list.sort(Comparator.reverseOrder());

        for (String s : list) {
            bw.write(s + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
