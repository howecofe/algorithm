import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            q.offer(progresses[i]);
        }
        
        int idx = 0;
        int days = 0;
        
        while (!q.isEmpty()) {
            // days += (100 - progresses[idx]) % speeds[idx] == 0 ?
            //     (100 - progresses[idx]) / speeds[idx]
            //     : (100 - progresses[idx]) / speeds[idx] + 1;
            days = (int) Math.ceil((100 - progresses[idx]) / speeds[idx]);
            
            int completedTasks = 0;
            while (!q.isEmpty() && q.peek() + speeds[idx] * days >= 100) {
                completedTasks++;
                q.poll();
                idx++;
            }
            
            if (completedTasks > 0) {
                list.add(completedTasks);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}