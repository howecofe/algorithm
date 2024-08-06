import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> Integer.compare(o1[1], o2[1]));
        
        int cam = 0, lastCam = -30001;
        int end = 0, start = 0;

        for (int i = 0; i < routes.length; i++) {
            start = routes[i][0];
            end = routes[i][1];

            if (lastCam < start) {
                cam++;
                lastCam = end;
            }

        }

        return cam;
    }
}