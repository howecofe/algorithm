import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            xList.add(sc.nextInt());
            yList.add(sc.nextInt());
        }

        Collections.sort(xList);
        Collections.sort(yList);

        int x = Objects.equals(xList.get(1), xList.get(0)) ? xList.get(2) : xList.get(0); // Integer 타입이므로 == 연산자 말고 Obejcts.equals()로 비교해야 한다.
        int y = Objects.equals(yList.get(1), yList.get(0)) ? yList.get(2) : yList.get(0);

        System.out.println(x + " " + y);
    }
}

// 참고 : https://djm03178.tistory.com/14