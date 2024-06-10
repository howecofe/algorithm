import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (long i = 0; i < n + m; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : map.keySet()) {
            if (map.get(name) > 1) { list.add(name); }
        }

        list.sort(Comparator.naturalOrder());

        bw.write(list.size() + "\n");
        
        for (String name : list) {
            bw.write(name + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
