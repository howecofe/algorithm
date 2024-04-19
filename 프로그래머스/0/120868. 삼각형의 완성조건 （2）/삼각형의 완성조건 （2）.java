import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        // if max == sides[1] -> sides[0];
        // if max == 다른 한 변 -> sides[0] - 1;    
        return 2 * sides[0] - 1;
    }
}