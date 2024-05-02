import java.util.*;

class Solution {
    List<int[]> obstacles;
    int currX;
    int currY;
    
    public Solution() {
        this.currX = 0;
        this.currY = 0;
        this.obstacles = new ArrayList<>();
    }
    
    public int[] solution(String[] park, String[] routes) {      
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    currX = i;
                    currY = j;
                } else if (park[i].charAt(j) == 'X') {
                    obstacles.add(new int[]{i, j});
                }
            }
        }
        
        int h = park.length;
        int w = park[0].length();
        
        for (String route : routes) {
            String[] routeArr = route.split(" ");
            String direction = routeArr[0];
            int distance = Integer.parseInt(routeArr[1]);
            int newX = currX, newY = currY;
            
            if (direction.equals("E")) {
                newY += distance;
            } else if (direction.equals("W")) {
                newY -= distance;
            } else if (direction.equals("S")) {
                newX += distance;
            } else {
                newX -= distance;
            }
            
            if (newY < 0 || newY >= w || newX < 0 || newX >= h) { continue; }
            
            if (!hasObstacle(currX, currY, newX, newY)) {
                currX = newX;
                currY = newY;
            }
        }
        
        return new int[]{currX, currY};
    }
    
    private boolean hasObstacle(int currX, int currY, int newX, int newY) {
        for (int i = Math.min(currX, newX); i <= Math.max(currX, newX); i++) {
            for (int j = Math.min(currY, newY); j <= Math.max(currY, newY); j++) {
                for (int[] obs : obstacles) {
                    if (obs[0] == i && obs[1] == j) { return true; }
                }
            }
        }
        
        return false;
    }
}