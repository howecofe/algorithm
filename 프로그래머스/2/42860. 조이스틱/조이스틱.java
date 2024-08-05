class Solution {
    public int solution(String name) {
        int ud = 0; // 상하
        int lr = name.length() - 1; // 좌우 (초기값: 계속 오른쪽으로 이동하는 경우)
        boolean onlyA = true;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            if (c == 'A') continue;

            onlyA = false;

            // 상하 이동 횟수
            ud += Math.min(c - 'A', 'Z' - c + 1);

            // 좌우 이동 횟수 계속 갱신
            // 1. A가 아닌 다음 값 인덱스 찾기
            int cursor = i + 1;
            while (cursor < name.length() && name.charAt(cursor) == 'A') cursor++;

            // 2. 오른쪽 먼저 갔다가 왼쪽으로 가는 경우
//            lr = Math.min(lr, i * 2 + (name.length() - cursor));
            // 3. 왼쪽 먼저 갔다가 오른쪽으로 가는 경우
//            lr = Math.min(lr, (name.length() - cursor) * 2 + i);
            lr = Math.min(lr, i + (name.length() - cursor) + Math.min(i, name.length() - cursor));
        }

        if (onlyA) lr = 0;

        return ud + lr;
    }
}