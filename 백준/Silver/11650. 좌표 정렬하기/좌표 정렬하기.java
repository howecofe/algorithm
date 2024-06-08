import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            list.add(new Integer[]{Integer.parseInt(s[0]), Integer.parseInt(s[1])});
        }

        Collections.sort(list, (o1, o2) -> {
            int result = o1[0].compareTo(o2[0]);
            if (result == 0) {
                return o1[1].compareTo(o2[1]);
            } else {
                return result;
            }
        });

        for (Integer[] arr : list) {
            bw.write(arr[0] + " " + arr[1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
