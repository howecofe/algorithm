import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> repMap = new HashMap<>();
        for (String id : id_list) {
            repMap.put(id, new HashSet<>());
        }
        
        Set<String> repSet = new HashSet<>();
        for (String rep : report) {
            repSet.add(rep);
        }
        
        Map<String, Integer> repCntMap = new HashMap<>();
        Iterator<String> it = repSet.iterator();
        
        while (it.hasNext()) {
            String[] repArr = it.next().split(" ");
            repMap.get(repArr[0]).add(repArr[1]);
            repCntMap.put(repArr[1], repCntMap.getOrDefault(repArr[1], 0) + 1);
        }
        
        int[] answer = new int[id_list.length];
        for (String reported : repCntMap.keySet()) {
            if (repCntMap.get(reported) >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if (repMap.get(id_list[i]).contains(reported)) { answer[i]++; }
                }
            }
        }

        return answer;
    }
}