class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int max = Math.max(row, col);
        int[][] answer = new int[max][max];
        
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (i < row && j < col) { answer[i][j] = arr[i][j]; }
                else { answer[i][j] = 0; } // 현재 인덱스가 arr 배열의 크기를 벗어나면 0으로 채우기
            }
        }

        return answer;
    }
}