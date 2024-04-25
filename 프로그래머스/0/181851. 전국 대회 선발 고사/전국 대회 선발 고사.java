import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) { list.add(rank[i]); }
        }
        list.sort(Comparator.naturalOrder());
        
        int idx = 0;
        int num = 10000;
        int answer = 0;
        while (idx < 3) {
            for (int i = 0; i < rank.length; i++) {
                if (list.get(idx) == rank[i]) {
                    answer += num * i;
                    num /= 100;
                    idx++;
                    break;
                }
            }
        }
        
        return answer;
    }
}