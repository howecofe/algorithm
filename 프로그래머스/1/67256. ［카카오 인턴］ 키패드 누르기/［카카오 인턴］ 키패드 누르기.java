class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        // *: 10, 0: 11, #: 12
        int lLoc = 10, rLoc = 12;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) { numbers[i] = 11; }
        }
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                lLoc = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rLoc = num;
            } else {
                int lDist = getDistance(Math.abs(num - lLoc));
                int rDist = getDistance(Math.abs(num - rLoc));
                
                if ((lDist == rDist && hand.equals("left")) || lDist < rDist) {
                    sb.append("L");
                    lLoc = num;
                } else {
                    sb.append("R");
                    rLoc = num;
                }
            }
        }
        
        return sb.toString();
    }
    
    private static int getDistance(int num) {
        if (num == 0) { return 0; }
        else if (num == 1 || num == 3) { return 1; }
        else if (num == 2 || num == 4 || num == 6) { return 2; }
        else if (num == 5 || num == 7 || num == 9) { return 3; }
        else { return 4; }
    }
}