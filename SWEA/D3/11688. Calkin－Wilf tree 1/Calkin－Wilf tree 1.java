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
            char[] arr = sc.next().toCharArray();
            int a = 1, b = 1;

            for (char c : arr) {
                if (c == 'L') {
                    b = a + b;
                } else {
                    a = a + b;
                }
            }

            int gcd = gcd(a, b);
            System.out.printf("#%d %d %d\n", test_case, a / gcd, b / gcd);
        }
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) { return b; }

        return gcd(b, a % b);
    }
}