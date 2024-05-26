import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        // 거꾸로 만든다.
        for (int i = 0; i < n1.length(); i++) {
            sb1.insert(0, n1.charAt(i));
            sb2.insert(0, n2.charAt(i));
        }
        
        // 최댓값을 구한다.
        int max = Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString()));

        System.out.println(max);
    }
}