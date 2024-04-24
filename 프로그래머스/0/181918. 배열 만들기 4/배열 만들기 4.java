import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        for (int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}