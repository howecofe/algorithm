import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("res/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        // 풀이
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++)  set.add(Integer.parseInt(nums[i]));

        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());

        // 출력
        for (int n : list) bw.write(n + " ");

        br.close();
        bw.flush();
        bw.close();
    }
}