import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int selected = getIndex(ext);
        int sorted = getIndex(sort_by);
        
        for (int[] d : data) {
            if (d[selected] < val_ext) { list.add(d); }                
        }
        
        int[] sortedArr = new int[list.size()];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = list.get(i)[sorted];
        }
        Arrays.sort(sortedArr);
        
        int[][] answer = new int[list.size()][data[0].length];
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (sortedArr[i] == list.get(j)[sorted]) {
                    answer[i] = list.get(j);
                    break;
                }
            }
        }
        
        return answer;
    }
    
    private static int getIndex(String data) {
        int idx = -1;
        switch (data) {
            case "code": idx = 0; break;
            case "date": idx = 1; break;
            case "maximum": idx = 2; break;
            case "remain": idx = 3; break;
        }
        return idx;
    }
}