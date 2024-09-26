import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int n : nums) set.add(n);

        return Math.min(set.size(), nums.length / 2);
    }

}













// 조합 풀이
//class Solution {
//    static int[] tgt;
//    static int[] src;
//    static int N, max;
//    public int solution(int[] nums) {
//        // N개 중 N/2개 고르는 조합
//        N = nums.length;
//        src = Arrays.copyOf(nums, N);
//        tgt = new int[N / 2];
//        comb(0, 0);
//
//        return max;
//    }
//
//    static void comb(int srcIdx, int tgtIdx) {
//        if (tgtIdx == tgt.length) {
//            // 조합 1개 완성
//            Set<Integer> set = new HashSet<>();
//            for (int n : tgt) set.add(n);
//            max = Math.max(max, set.size());
//            return;
//        }
//
//        if (srcIdx == N) return;
//
//        tgt[tgtIdx] = src[srcIdx];
//        comb(srcIdx + 1, tgtIdx + 1);
//        comb(srcIdx + 1, tgtIdx);
//    }
//
//}