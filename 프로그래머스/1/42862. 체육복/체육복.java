import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] stu = new int[n + 1]; // 0: dummy
        int cnt = n;

        for (int l : lost) stu[l]--;
        for (int r : reserve) stu[r]++;

        for (int i = 1; i < stu.length; i++) {
            if (stu[i] < 0) { // 잃어버린 경우
                if (i - 1 > 0 && stu[i - 1] > 0) {
                    stu[i]++;
                    stu[i - 1]--;
                } else if (i + 1 <= n && stu[i + 1] > 0) {
                    stu[i]++;
                    stu[i + 1]--;
                } else {
                    cnt--;
                }
            }
        }

        return cnt;
    }
}