import java.util.*;

class Solution {
    static int ansLen;
    static boolean[] visited;
    static List<String> ansList = new ArrayList<>();
    static Map<String, List<String>> map = new HashMap<>();
    static Map<String, List<Integer>> idxMap = new HashMap<>();
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        ansLen = tickets.length + 1;
        
        for (int i = 0; i < tickets.length; i++) {
            map.putIfAbsent(tickets[i][0], new ArrayList<>());
            map.get(tickets[i][0]).add(tickets[i][1]);
            
            String key = Arrays.toString(tickets[i]);
            idxMap.putIfAbsent(key, new ArrayList<>());
            idxMap.get(key).add(i);
        }
        
        for (List<String> list : map.values()) Collections.sort(list);
        
        List<String> pathList = new ArrayList<>();
        pathList.add("ICN");
        dfs("ICN", pathList);
        
        // list -> array
        String[] answer = new String[ansList.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = ansList.get(i);
        
        return answer;
    }
    
    static void dfs(String start, List<String> list) {
        if (list.size() == ansLen) {
            if (ansList.isEmpty()) {
                ansList = new ArrayList<>(list);
            }
            return;
        }
        
        if (!map.containsKey(start)) return;
        
        for (String end : map.get(start)) {
            // 방문 여부 체크
            for (int idx : idxMap.get(Arrays.toString(new String[]{start, end}))) {
                if (visited[idx]) continue;
                
                visited[idx] = true;
                list.add(end);
                dfs(end, list);
                list.remove(list.size() - 1); // backtrack
                visited[idx] = false; // backtrack
                break;
            }
        }
    }

}