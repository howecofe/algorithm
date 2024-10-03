import java.util.*;

class Solution {
    
    class Node {
        int idx;
        int score;
        
        Node(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        LinkedList<Node> q = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Node(i, priorities[i]));
        }
        
        Arrays.sort(priorities);
        
        for (int i = priorities.length - 1; i >= 0; i--) {
            int max = priorities[i];
            
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node.score == max) {
                    cnt++;
                    if (node.idx == location) return cnt;
                    break;
                } else {
                    q.add(node);
                }
            }
            
        }
        
        return cnt;
    }
}