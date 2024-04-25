class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int row = 0, col = 0, num = 1, direction = 0;
        
        while (num <= n * n) {
            answer[row][col] = num++;

            if (direction == 0) { // 오른쪽으로 이동
                if (col < n - 1 && answer[row][col + 1] == 0) {
                    col++;
                } else {
                    direction = 1;
                    row++;
                }
            } else if (direction == 1) { // 아래로 이동
                if (row < n - 1 && answer[row + 1][col] == 0) {
                    row++;
                } else {
                    direction = 2;
                    col--;
                }
            } else if (direction == 2) { // 왼쪽으로 이동
                if (col > 0 && answer[row][col - 1] == 0) {
                    col--;
                } else {
                    direction = 3;
                    row--;
                }
            } else { // 위로 이동
                if (row > 0 && answer[row - 1][col] == 0) {
                    row--;
                } else {
                    direction = 0;
                    col++;
                }
            }
        }
        
        return answer;
    }
}