import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
    public static void main(String args[]) throws Exception
    {
       // System.setIn(new FileInputStream("res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            System.out.printf("#%d %d\n", test_case, num / 3);
        }
    }
}