import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        List<String> list = new ArrayList<>(Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="));
        
        for (String s : list) {
            if (word.contains(s)) {
                word = word.replace(s, "_");
            }
        }

        System.out.println(word.length());
    }
}

