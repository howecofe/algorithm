import java.sql.Array;
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
            int N = sc.nextInt();
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int n = sc.nextInt();
                list.add(n);
                sum += n;
            }

            int avg = sum / N;
            int answer = 0;

            for (int n : list) {
                if (n <= avg) { answer++; }
            }

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }
}