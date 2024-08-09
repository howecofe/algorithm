import java.util.*;

class Solution {
    static boolean[] visited;
    static Map<String, List<String>> map = new HashMap<>();
    static Map<String, List<Integer>> tktIdxMap = new HashMap<>();
    static List<String> ansList = new ArrayList<>();
    static int ansLen;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        ansLen = tickets.length + 1;

        // key: 출발 공항, value: 도착 공항
        for (int i = 0; i < tickets.length; i++) {
            map.putIfAbsent(tickets[i][0], new ArrayList<>());
            map.get(tickets[i][0]).add(tickets[i][1]);
            // 중복 티켓이 있을 수 있으므로 인덱스를 리스트에 추가
            tktIdxMap.putIfAbsent(Arrays.toString(tickets[i]), new ArrayList<>());
            tktIdxMap.get(Arrays.toString(tickets[i])).add(i);
        }

        // value 오름차순 정렬
        for (List<String> list : map.values()) Collections.sort(list);

        // ICN 공항부터 방문 시작
        List<String> pathList = new ArrayList<>();
        pathList.add("ICN");
        dfs("ICN", pathList);

        // list -> array
        String[] ans = new String[ansLen];
        for (int i = 0; i < ans.length; i++) ans[i] = ansList.get(i);

        return ans;
    }

    static void dfs(String start, List<String> pathList) {
        if (pathList.size() == ansLen) {
            if (ansList.isEmpty()) { // 최초에만 list 복사
                ansList = new ArrayList<>(pathList);
            }
            return;
        }

        List<String> ends = map.get(start);
        if (ends == null) return;

        for (String end : ends) {
            int idx = -1;
            boolean canVisit = false;
            // 방문하지 않은 티켓인지 확인
            for (int i : tktIdxMap.get(Arrays.toString(new String[]{start, end}))) {
                if (visited[i]) continue;
                canVisit = true;
                idx = i;
                break;
            }

            if (!canVisit) continue;

            visited[idx] = true;
            pathList.add(end);
            dfs(end, pathList);
            pathList.remove(pathList.size() - 1); // backtrack
            visited[idx] = false; // backtrack
        }
    }
}