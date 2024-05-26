import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            List<Character> list = new ArrayList<>();
            char[] alpha = sc.next().toCharArray();
            boolean isSuccessive = true;

            char latest = alpha[0];
            list.add(alpha[0]);

            for (int j = 1; j < alpha.length; j++) {
                if (alpha[j] != latest) {
                    if (list.contains(alpha[j])) {
                        isSuccessive = false;
                        break;
                    }

                    latest = alpha[j];
                    list.add(latest);
                }
            }

            if (isSuccessive) answer++;
        }

        System.out.println(answer);
    }
}

