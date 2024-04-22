import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        List<Integer[]> list = new ArrayList<>();
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                Integer[] arr = new Integer[2];
                if (lines[i][0] <= lines[j][0] && lines[j][0] < lines[i][1]) {
                    if (lines[j][1] <= lines[i][1]) {
                        list.add(new Integer[]{lines[j][0], lines[j][1]});
                    } else {
                        list.add(new Integer[]{lines[j][0], lines[i][1]});
                    }
                } else if (lines[j][0] < lines[i][0]) {
                    if (lines[i][0] < lines[j][1] && lines[j][1] <= lines[i][1]) {
                        list.add(new Integer[]{lines[i][0], lines[j][1]});
                    } else if (lines[i][1] < lines[j][1]) {
                        list.add(new Integer[]{lines[i][0], lines[i][1]});
                    }
                }
            }
        }
        
        if (list.size() == 0) { 
            return 0;
        } else if (list.size() == 1 || list.size() == 2) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i)[1] - list.get(i)[0];
            }
            return sum;
        } else { // list.size() == 3
            int min = list.get(0)[0];
            int max = list.get(0)[1];
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i)[0]) { min = list.get(i)[0]; }
                if (max < list.get(i)[1]) { max = list.get(i)[1]; }
            }
            return max - min;
        }
    }
}