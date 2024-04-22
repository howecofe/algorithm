class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    int kStart = i == 0 ? 0 : i - 1;
                    int lStart = j == 0 ? 0 : j - 1;
                    int kEnd = i == board.length - 1 ? board.length - 1 : i + 1;
                    int lEnd = j == board.length - 1 ? board.length - 1 : j + 1;
                    for (int k = kStart; k <= kEnd; k++) {
                        for (int l = lStart; l <= lEnd; l++) {
                            if (board[k][l] != 1) { board[k][l] = 2; }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) { answer++; }
            }
        }
        
        return answer;
    }
}