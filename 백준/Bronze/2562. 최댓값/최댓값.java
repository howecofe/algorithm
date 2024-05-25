import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            map.put(sc.nextInt(), i);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, Comparator.reverseOrder());

        int max = keySet.get(0);
        int order = map.get(max);
        
        System.out.println(max + "\n" + order);
    }
}