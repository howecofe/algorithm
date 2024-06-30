import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    static int N, maxCntNum;
    static double sum;
    static List<Integer> list = new ArrayList<>();
    static List<Map.Entry<Integer, Integer>> cntList;
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        N = Integer.parseInt(br.readLine());

        // 풀이
        if (N == 1) {
            int num = Integer.parseInt(br.readLine());
            bw.write(num + "\n");
            bw.write(num + "\n");
            bw.write(num + "\n");
            bw.write(0 + "");
        } else {
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(br.readLine());
                sum += num;
                list.add(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            list.sort(Comparator.naturalOrder());

            cntList = new ArrayList<>(map.entrySet());
            cntList.sort((o1, o2) -> o2.getValue() == o1.getValue()? o1.getKey() - o2.getKey() : o2.getValue() - o1.getValue());

            if (cntList.get(0).getValue() == cntList.get(1).getValue()) {
                maxCntNum = cntList.get(1).getKey();
            } else {
                maxCntNum = cntList.get(0).getKey();
            }

            // 출력
            // 산술평균
            bw.write((int)Math.round(sum / N) + "\n");
            // 중앙값
            bw.write(list.get(N / 2) + "\n");
            // 최빈값
            bw.write(maxCntNum + "\n");
            // 범위
            bw.write(list.get(N - 1) - list.get(0) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}