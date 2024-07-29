import java.util.*;

class Solution {
    static Queue<int[]> workQ = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1])); // 작업 소요 시간 빠른 순
    static Queue<int[]> waitQ = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]); // 요청 시간 빠른 순
    static int res, currTime;
    
    public int solution(int[][] jobs) {
        for (int[] j : jobs) waitQ.offer(j);

        while (!waitQ.isEmpty() || !workQ.isEmpty()) {
            // 현재 시간 기준, 작업 가능한 대상 고르기
            while (!waitQ.isEmpty() && waitQ.peek()[0] <= currTime) {
                workQ.offer(waitQ.poll());
            }

            // 작업 가능한 대상이 없으면 현재 시간을 남은 작업들 중 최소 요청 시간으로 조정
            if (workQ.isEmpty()) currTime = waitQ.peek()[0];
            else { // 작업 가능한 대상이 있으면, 작업소요시간이 가장 적은 것을 꺼내 작업
                int[] job = workQ.poll();
                res += currTime + job[1] - job[0];
                currTime += job[1];
            }
        }

        return res / jobs.length;
    }
}