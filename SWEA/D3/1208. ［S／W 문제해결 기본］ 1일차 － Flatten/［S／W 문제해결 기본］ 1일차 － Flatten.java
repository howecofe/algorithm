import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        //System.setIn(new FileInputStream("res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 100; i++) { list.add(sc.nextInt()); }
            Collections.sort(list);

            for (int i = 1; i <= N; i++) {
                int max = list.get(list.size() - 1);
                int min = list.get(0);

                if (max - min <= 1) { break; }

                list.set(list.size() - 1, max - 1);
                list.set(0, min + 1);

                Collections.sort(list);
            }

            int answer = list.get(list.size() - 1) - list.get(0);

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }
}