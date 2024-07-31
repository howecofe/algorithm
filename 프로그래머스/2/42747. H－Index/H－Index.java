import java.util.*;

class Solution {
    public int solution(int[] citations) {
        List<Integer> list = new ArrayList<>();
        for (int c : citations) list.add(c);
        list.sort(Comparator.reverseOrder());

        int answer = 0;
        int max = list.get(0);
        for (int h = max; h >= 0; h--) {
            int cnt = 0;
            for (int c : citations) {
                if (c >= h) cnt++;
            }

            if (cnt >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}