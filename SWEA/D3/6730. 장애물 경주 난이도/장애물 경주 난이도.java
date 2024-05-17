import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        //System.setIn(new FileInputStream("res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int up = 0, down = 0;
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }

            for (int i = 0; i < list.size() - 1; i++) {
                int diff = list.get(i) - list.get(i + 1);
                if (diff < 0) { // 올라가기
                    if (up < diff * -1) { up = diff * -1; }
                } else if (diff > 0) { // 내려가기
                    if (down < diff) { down = diff; }
                }
            }

            System.out.printf("#%d %d %d\n", test_case, up, down);
        }
    }
}