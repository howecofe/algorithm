class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        
        int[] dh = new int[]{1, 0, -1, 0};
        int[] dw = new int[]{0, 1, 0, -1};
        
        for (int i = 0; i < dh.length; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (0 <= h_check && h_check < board.length && 0 <= w_check && w_check < board.length) {
                if (board[h][w].equals(board[h_check][w_check])) { count++; }
            }
        }
        
        return count;
    }
}