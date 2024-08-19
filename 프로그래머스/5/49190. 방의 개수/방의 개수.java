import java.util.*;

class Solution {
    static class Node {
        int y;
        int x;
        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return y == node.y && x == node.x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(y, x);
        }
    }

    public int solution(int[] arrows) {
        int ans = 0;
        // key: 좌표, value: key 좌표와 연결된 간선 좌표 list
        Map<Node, List<Node>> map = new HashMap<>();

        int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};

        // 처음 위치 : (0, 0)
        Node curr = new Node(0, 0);
        map.put(curr, new ArrayList<>());

        for (int ar : arrows) {
            // 교차점 처리를 위한 스케일업(2번 반복)
            for (int i = 0; i < 2; i++) {
                int newY = curr.y + dy[ar];
                int newX = curr.x + dx[ar];
                Node next = new Node(newY, newX);

                // 처음 방문하는 좌표인 경우
                if (!map.containsKey(next)) {
                    map.put(next, new ArrayList<>());
                    map.get(next).add(curr); // 간선 추가
                    map.get(curr).add(next);
                } else { // 재방문 좌표인 경우
                    // 현재 좌표에서 방문했던 간선인지 체크
                    if (!map.get(next).contains(curr)) {
                        map.get(next).add(curr);
                        map.get(curr).add(next);
                        ans++; // 재방문 좌표 && 방문하지 않았던 간선이면 방 추가
                    }
                }

                curr = next;
            }
        }

        return ans;
    }
}