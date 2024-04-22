import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double num1 = (dots[i][1] - dots[j][1]) / (double)(dots[i][0] - dots[j][0]);
                
                List<Integer[]> list = new ArrayList<>();
                for (int k = 0; k < dots.length; k++) {
                    if (!(k == i || k == j)) {
                        list.add(new Integer[]{dots[k][0], dots[k][1]});
                    }
                }
                
                double num2 = (list.get(0)[1]- list.get(1)[1]) / (double)(list.get(0)[0] - list.get(1)[0]);
                
                if (num1 == num2) { return 1; }
            }
        }
        
        return 0;
    }
}