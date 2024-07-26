import java.util.*;

class Solution {

    static int res;
    public int solution(int k, int m, int[] score) {
        int boxCnt = score.length / m;
        if (boxCnt == 0) return 0;

        Arrays.sort(score);
        for (int i = 1; i <= boxCnt; i++) {
            res += score[score.length - m * i] * m;
        }
        return res;
    }
}
