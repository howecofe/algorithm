import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"));
        int time = 0;

        for (int i = 0; i < list.size(); i++) { map.put(list.get(i), i + 3); }

        for (String s : str) {
            for (String key : map.keySet()) {
                if (key.contains(s)) {
                    time += map.get(key);
                    break;
                }
            }
        }

        System.out.println(time);
    }
}