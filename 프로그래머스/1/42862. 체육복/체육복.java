import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        
        List<Integer> lList = new ArrayList<>();
        List<Integer> rList = new ArrayList<>();
        
        for (int l : lost) lList.add(l);
        for (int r : reserve) rList.add(r);

        // 본인 도난 check
        List<Integer> tmp = new ArrayList<>();
        for (int r : rList) {
            if (lList.contains(r)) tmp.add(r);
        }
        
        if (!tmp.isEmpty()) {
            for (int t : tmp) {
                lList.remove(new Integer(t));
                rList.remove(new Integer(t));
            }
        }
        
        // 다른사람 도난 check
        for (int r : rList) {
            if (lList.contains(r - 1)) lList.remove(new Integer(r - 1));
            else if (lList.contains(r + 1)) lList.remove(new Integer(r + 1));
        }
        
        return n - lList.size();
    }
}