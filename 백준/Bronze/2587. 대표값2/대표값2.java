import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
        }

        Collections.sort(list);

        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}