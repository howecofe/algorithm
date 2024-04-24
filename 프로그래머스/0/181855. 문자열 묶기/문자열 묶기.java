import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[strArr.length + 1];
        for (String str : strArr) {
            cnt[str.length()]++;
        }
        Arrays.sort(cnt);
        return cnt[cnt.length - 1];
    }
}