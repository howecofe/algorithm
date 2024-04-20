class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for (String key : keyinput) {
            if (key.equals("up")) {
                y = checkNum(board[1], ++y);
            } else if (key.equals("down")) {
                y = checkNum(board[1], --y);
            } else if (key.equals("left")) {
                x = checkNum(board[0], --x);
            } else {
                x = checkNum(board[0], ++x);
            }
        }
        
        return new int[]{x, y};
    }
    
    int checkNum(int board, int num) {
        if (Math.abs(num) > Math.abs(board / 2)) { 
            num = (num > 0) ? board / 2 : board / 2 * (-1);
        }
        return num;
    }
}