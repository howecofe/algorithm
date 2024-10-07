import java.util.*;

class Solution {
    
    public int solution(int[][] jobs) {
        Queue<int[]> waitQ = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]); // 요청시간 빠른 순
        Queue<int[]> workQ = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 작업시간 빠른 순
        
        for (int[] job : jobs) waitQ.offer(job);
        
        int currTime = 0;
        int totalTime = 0;
        
        while (!waitQ.isEmpty() || !workQ.isEmpty()) {
            // 현재시간 기준, 작업 가능한 작업을 골라 작업큐에 넣기
            while (!waitQ.isEmpty() && waitQ.peek()[0] <= currTime) {
                workQ.offer(waitQ.poll());
            }
            
            if (workQ.isEmpty()) { // 작업큐가 비어있으면 현재시간을 대기큐 최소 요청시간으로 조정
                currTime = waitQ.peek()[0];
            } else {
                int[] job = workQ.poll();
                currTime += job[1];
                totalTime += currTime - job[0];
            }
        }
        
        
        return totalTime / jobs.length;
    }
}