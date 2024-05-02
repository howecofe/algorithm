import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<int[]> points = new ArrayList<>();
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') { points.add(new int[]{i, j}); }
            }
        }
        
        int xmin = points.get(0)[0];
        int xmax = points.get(points.size() - 1)[0];
        
        int ymin = points.get(0)[1];
        int ymax = points.get(0)[1];
        
        for (int[] p : points) {
            if (p[1] < ymin) { ymin = p[1]; }
            if (p[1] > ymax) { ymax = p[1]; }
        }
        
        return new int[]{xmin, ymin, xmax + 1, ymax + 1};
    }
}