import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = a > b ? ">" : (a < b ? "<" : "==");
        
        System.out.println(op);
    }
}