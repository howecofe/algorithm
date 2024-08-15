import java.util.*;

class Solution {
    public int solution(String arr[]) {
        int size = arr.length / 2 + 1; // 숫자 개수
        int[][] maxDp = new int[size][size];
        int[][] minDp = new int[size][size];

        for (int[] max : maxDp) Arrays.fill(max, Integer.MIN_VALUE);
        for (int[] min : minDp) Arrays.fill(min, Integer.MAX_VALUE);

        for (int step = 0; step < size; step++) { // step
            for (int i = 0; i < size - step; i++) { // step별 i ~ j 구간의 최대, 최소 구하기
                int j = i + step;

                // i == j이면 자기 자신의 값으로 채우기
                if (i == j) {
                    maxDp[i][j] = Integer.parseInt(arr[i * 2]);
                    minDp[i][j] = Integer.parseInt(arr[i * 2]);
                    continue;
                }

                // i~j 구간의 각 연산자를 돌면서 최대 최소 갱신
                for (int k = i; k < j; k++) { // i ~ j 사이의 연산 개수
                    int op = k * 2 + 1; // 연산자 index
                    if (arr[op].equals("+")) {
                        maxDp[i][j] = Math.max(maxDp[i][j], maxDp[i][k] + maxDp[k + 1][j]);
                        minDp[i][j] = Math.min(minDp[i][j], minDp[i][k] + minDp[k + 1][j]);
                    } else if (arr[op].equals("-")) {
                        maxDp[i][j] = Math.max(maxDp[i][j], maxDp[i][k] - minDp[k + 1][j]);
                        minDp[i][j] = Math.min(minDp[i][j], minDp[i][k] - maxDp[k + 1][j]);
                    }
                }
            }
        }

        return maxDp[0][size - 1];
    }
}