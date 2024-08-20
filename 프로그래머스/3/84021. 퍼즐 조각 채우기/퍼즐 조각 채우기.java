import java.util.*;

class Solution {
    
    static class Point {
        int y;
        int x;
        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int size;
    static int ans;

    public static int solution(int[][] game_board, int[][] table) {
        size = game_board.length;

        // 그룹별 좌표 저장 리스트
        List<List<Point>> boardList = new ArrayList<>();
        List<List<Point>> tableList = new ArrayList<>(); // puzzle

        // bfs 방문체크용 배열
        boolean[][] boardVisited = new boolean[size][size];
        boolean[][] tableVisited = new boolean[size][size];

        // 1. 그룹별 좌표 구하기 (bfs)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // 보드판 빈 칸 좌표 저장
                if (game_board[i][j] == 0 && !boardVisited[i][j]) {
                    bfs(i, j, 0, boardVisited, game_board, boardList);
                }

                // 퍼즐 좌표 저장
                if (table[i][j] == 1 && !tableVisited[i][j]) {
                    bfs(i, j, 1, tableVisited, table, tableList);
                }
            }
        }

        // 채워진 보드판 영역인지 확인하는 용도
        boolean[] visited = new boolean[boardList.size()];

        // 2. 퍼즐을 회전해서 채울 수 있는 영역인지 확인
        for (int i = 0; i < tableList.size(); i++) {
            List<Point> tablePoints = tableList.get(i);

            for (int j = 0; j < boardList.size(); j++) {
                List<Point> boardPoints = boardList.get(j);

                // 좌표 개수 동일한지 & 채워진 영역인지 확인
                if (tablePoints.size() == boardPoints.size() && !visited[j]) {
                    // 해당 영역에 퍼즐을 채울 수 있는지 확인
                    if (rotateAndCheckPuzzle(tablePoints, boardPoints)) {
                        ans += tablePoints.size();
                        visited[j] = true;
                        break; // 채워졌으므로 다음 퍼즐로 넘어간다.
                    }
                }
            }
        }

        return ans;
    }

    static void bfs(int y, int x, int flag, boolean[][] visited, int[][] graph, List<List<Point>> list) {
        List<Point> tmpList = new ArrayList<>(); // 한 그룹의 좌표들 저장
        Queue<Point> q = new LinkedList();

        // 시작 좌표 넣고 방문 처리
        q.add(new Point(y, x));
        visited[y][x] = true;

        // 시작 좌표를 원점으로 만들어 저장
        tmpList.add(new Point(y - y, x - x));

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int d = 0; d < 4; d++) {
                int newY = p.y + dy[d];
                int newX = p.x + dx[d];

                // 방문 가능한지 체크
                if (newY < 0 || newY >= size || newX < 0 || newX >= size || visited[newY][newX] || graph[newY][newX] != flag) continue;

                q.offer(new Point(newY, newX));
                visited[newY][newX] = true;

                tmpList.add(new Point(newY - y, newX - x));
            }
        }

        list.add(tmpList);
    }

    static boolean rotateAndCheckPuzzle(List<Point> tablePoints, List<Point> boardPoints) {
        // 보드판 좌표들 오름차순 정렬 (원점 조정된 상태)
        boardPoints.sort((o1, o2) -> o1.y - o2.y == 0 ? o1.x - o2.x : o1.y - o2.y);

        // 90도씩 4번 회전
        for (int i = 0; i < 4; i++) {
            boolean correct = true;

            // 퍼즐 좌표들 오름차순 정렬
            tablePoints.sort((o1, o2) -> o1.y - o2.y == 0 ? o1.x - o2.x : o1.y - o2.y);

            // 회전했으므로 다시 원점 기준으로 조정
            int oy = tablePoints.get(0).y;
            int ox = tablePoints.get(0).x;
            for (int j = 0; j < tablePoints.size(); j++) {
                tablePoints.get(j).y -= oy;
                tablePoints.get(j).x -= ox;
            }

            for (int j = 0; j < boardPoints.size(); j++) {
                Point boardPoint = boardPoints.get(j);
                Point tablePoint = tablePoints.get(j);

                // 좌표 일치하는 경우 continue
                if (boardPoint.y == tablePoint.y && boardPoint.x == tablePoint.x) continue;

                // 좌표 불일치
                correct = false;
                break;
            }

            // 모든 좌표가 일치하면 채울 수 있는 영역이므로 return true
            if (correct) return true;

            // 퍼즐 좌표들 다음 90도 회전 : (y, x) -> (-x, y)
            for (int j = 0; j < tablePoints.size(); j++) {
                int tmp = tablePoints.get(j).x;
                tablePoints.get(j).x = tablePoints.get(j).y;
                tablePoints.get(j).y = -tmp;
            }
        }

        // 회전 4번이 다 끝났는데도 일치하지 않으면 채울 수 없는 영역이므로 return false
        return false;
    }
}