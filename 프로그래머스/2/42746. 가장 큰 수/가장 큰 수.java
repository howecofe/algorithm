import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>();
        for (int n : numbers) list.add(String.valueOf(n));

        list.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // list의 모든 원소가 0인 경우
        if (list.get(0).equals("0")) return "0";

        for (String n : list) sb.append(n);
        return sb.toString();
    }
}