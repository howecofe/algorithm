import java.util.*;

class Solution {
    public int solution(int[][] triangle) {

        for (int i = 1; i < triangle.length; i++) { // 현재 i층의 각 요소에 도달하는 비용 구하기
            // i층의 첫번째 요소에서의 비용
            triangle[i][0] += triangle[i - 1][0];
            // i층의 마지막 요소에서의 비용
            triangle[i][i] += triangle[i - 1][i - 1];

            for (int j = 1; j < i; j++) {
                int topLeft = triangle[i - 1][j - 1];
                int topRight = triangle[i - 1][j];
                triangle[i][j] += Math.max(topLeft, topRight); // i-1층(바로 위층)에서의 최댓값에 현재 위치 비용 더하기
            }
        }

        // 맨 마지막 층의 경로 비용 중 최댓값 구하기
        int[] last = triangle[triangle.length - 1];
        Arrays.sort(last);

        return last[last.length - 1];
    }
}