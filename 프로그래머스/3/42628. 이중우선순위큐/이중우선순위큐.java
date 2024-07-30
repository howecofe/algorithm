import java.util.*;

class Solution {
    static int[] answer = new int[]{0, 0};
    static Queue<Integer> minQ = new PriorityQueue<>();
    static Queue<Integer> maxQ = new PriorityQueue<>(((o1, o2) -> o2 - o1));

    public int[] solution(String[] operations) {
        for (String op : operations) {
            String[] arr = op.split(" ");

            if (arr[0].equals("I")) {
                minQ.offer(Integer.parseInt(arr[1]));
                maxQ.offer(Integer.parseInt(arr[1]));
            } else if (!maxQ.isEmpty() && arr[0].equals("D") && arr[1].equals("1")) {
                int max = maxQ.poll();
                minQ.remove(max);
            } else if (!minQ.isEmpty() && arr[0].equals("D") && arr[1].equals("-1")) {
                int min = minQ.poll();
                maxQ.remove(min);
            }
        }

        if (!minQ.isEmpty() && !maxQ.isEmpty()) {
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }

        return answer;
    }

}