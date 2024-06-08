import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Long> list = new ArrayList<>();

        // list : 입력 값 세팅
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }

        // set : 중복 제거 및 오름차순 정렬
        Set<Long> set = new TreeSet<>(list);

        // map : 순서 저장
        Iterator<Long> it = set.iterator();
        Map<Long, Long> map = new HashMap<>();
        long cnt = 0;
        while (it.hasNext()) {
            map.put(it.next(), cnt);
            cnt++;
        }

        // 순서 출력
        for (long num : list) {
            bw.write(map.get(num) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
