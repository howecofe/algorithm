import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> proQueue = new LinkedList<>();
        LinkedList<Integer> orderQueue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            proQueue.offer(priorities[i]);
            orderQueue.offer(i);
        }
        
        while (!proQueue.isEmpty()) {
            int proVal = proQueue.poll();
            int ordVal = orderQueue.poll();
            boolean exists = false;
            
            for (int i = 0; i < proQueue.size(); i++) {
                if (proVal < proQueue.get(i)) {
                    exists = true;
                    break;
                }
            }
            
            if (exists) {
                proQueue.offer(proVal);
                orderQueue.offer(ordVal);
            } else {
                order.add(ordVal);
            }
        }
        
        return order.indexOf(location) + 1;
    }
}