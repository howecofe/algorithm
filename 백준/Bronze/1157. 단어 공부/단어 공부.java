import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        Integer[] arr = new Integer[26];
        Arrays.fill(arr, 0); // 객체 배열은 기본값 null이므로 0으로 초기화해주어야 한다.

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        char answer = list.indexOf(max) != list.lastIndexOf(max) ? '?' : (char)(list.indexOf(max) + 'A');

        System.out.println(answer);
    }
}

