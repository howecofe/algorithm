import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        List<List<int[]>> dp = new ArrayList<>();
        for (int i = 0; i < triangle.length; i++) dp.add(new ArrayList<>());

        dp.get(0).add(new int[]{triangle[0][0], 0});

        for (int i = 1; i < triangle.length; i++) { // 현재 i층에 도달하는 경로 비용 구하기
            for (int j = 0; j < dp.get(i - 1).size(); j++) { // i-1 층의 각 경로 비용에 왼쪽 대각선, 오른쪽 대각선 비용 더하기
                int num = dp.get(i - 1).get(j)[0];
                int idx = dp.get(i - 1).get(j)[1];

                // idx 기반으로 왼쪽 대각선, 오른쪽 대각선 비용 더하기
                int left = triangle[i][idx];
                int right = triangle[i][idx + 1];

                dp.get(i).add(new int[]{num + left, idx});
                dp.get(i).add(new int[]{num + right, idx + 1});
            }
        }

        // 맨 마지막 층의 경로 비용 중 최댓값 구하기
        List<int[]> last = dp.get(dp.size() - 1);
        last.sort((o1, o2) -> o2[0] - o1[0]);
        
        return last.get(0)[0];
    }
}