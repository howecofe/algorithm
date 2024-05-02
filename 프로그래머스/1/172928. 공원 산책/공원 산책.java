import java.util.*;

class Solution {
    List<int[]> list;
    int x;
    int y;
    
    public Solution() {
        this.x = 0;
        this.y = 0;
        this.list = new ArrayList<>();
    }
    
    public int[] solution(String[] park, String[] routes) {      
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                } else if (park[i].charAt(j) == 'X') {
                    list.add(new int[]{i, j});
                }
            }
        }
        
        int h = park.length;
        int w = park[0].length();
        
        for (String route : routes) {
            String[] r = route.split(" ");
            String op = r[0];
            int moveCnt = Integer.parseInt(r[1]);
            int tmpX = x, tmpY = y;
            
            if (op.equals("E")) {
                tmpY = y + moveCnt;
            } else if (op.equals("W")) {
                tmpY = y - moveCnt;
            } else if (op.equals("S")) {
                tmpX = x + moveCnt;
            } else {
                tmpX = x - moveCnt;
            }
            
            if (tmpY < 0 || tmpY >= w || tmpX < 0 || tmpX >= h) { continue; }
            
            if (!hasObstacle(tmpX, tmpY)) {
                x = tmpX;
                y = tmpY;
            }
        }
        
        return new int[]{x, y};
    }
    
    private boolean hasObstacle(int tmpX, int tmpY) {
        if (x != tmpX) {
            for (int i = Math.min(x, tmpX); i <= Math.max(x, tmpX); i++) {
                for (int[] X : list) {
                    if (X[0] == i && X[1] == y) { return true; }
                }
            }
        }
        
        if (y != tmpY) {
            for (int i = Math.min(y, tmpY); i <= Math.max(y, tmpY); i++) {
                for (int[] X : list) {
                    if (X[0] == x && X[1] == i) { return true; }
                }
            }
        }
        
        return false;
    }
}