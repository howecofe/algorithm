import java.util.*;

class Solution {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> maxQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Queue<Integer> minQ = new PriorityQueue<>();
        
        for (String op : operations) {
            String[] arr = op.split(" ");
            int n = Integer.parseInt(arr[1]);
            if (arr[0].equals("I")) {
                maxQ.offer(n);
                minQ.offer(n);
            } else {
                if (!maxQ.isEmpty() && n == 1) {
                    int max = maxQ.poll();
                    minQ.remove(max);
                } else if (!minQ.isEmpty() && n == -1) {
                    int min = minQ.poll();
                    maxQ.remove(min);
                }
            }
        }
        
        if (!minQ.isEmpty() && !maxQ.isEmpty()) {
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }
        
        return answer;
    }

}