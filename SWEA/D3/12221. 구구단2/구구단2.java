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
            int a = sc.nextInt();
            int b = sc.nextInt();

//            if (Integer.toString(a).length() == 1 && Integer.toString(b).length() == 1) {
//                answer = a * b;
//            } else {
//                answer = -1;
//            }

            if (a < 10 && b < 10) {
                answer = a * b;
            } else {
                answer = -1;
            }

            System.out.printf("#%d %d\n", test_case, answer);
        }
    }
}