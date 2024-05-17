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
            int answer = 0;
            int N = sc.nextInt();
            String before = sc.next();
            String after = sc.next();

            for (int i = 0; i < after.length(); i++) {
                if (i <= before.length() - 1) {
                    if (after.charAt(i) == before.charAt(i)) {
                        answer++;
                    }
                }
            }

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }
}