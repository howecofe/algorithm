import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() >= M) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((o1, o2) -> o1.getValue() == o2.getValue() ? ( // 1. 빈도수 내림차순 정렬
                o1.getKey().length() == o2.getKey().length() ? // 2. 문자열 길이 내림차순 정렬
                        o1.getKey().compareTo(o2.getKey()) : o2.getKey().length() - o1.getKey().length() // 3. 문자열 사전순 정렬
                ) : o2.getValue() - o1.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            bw.write(entry.getKey() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
