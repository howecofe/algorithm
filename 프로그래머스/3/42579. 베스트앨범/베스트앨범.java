import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalMap = new HashMap<>();
        List<Integer> ansList = new ArrayList<>();
    
        int len = genres.length;
        for (int i = 0; i < len; i++) {
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 재생횟수 높은 순으로 장르 정렬
        List<String> genList = new ArrayList<>(totalMap.keySet());
        genList.sort((o1, o2) -> totalMap.get(o2) - totalMap.get(o1));
        
        // 장르별 고유번호-재생횟수 저장
        for (String gen : genList) {
            Map<Integer, Integer> playMap = new HashMap<>();
            
            for (int i = 0; i < len; i++) {
                if (genres[i].equals(gen)) {
                    playMap.put(i, plays[i]);
                }
            }
            
            List<Integer> idxList = new ArrayList<>(playMap.keySet());
            idxList.sort((o1, o2) -> playMap.get(o2) == playMap.get(o1)?
                        o1 - o2 : playMap.get(o2) - playMap.get(o1));
            
            if (idxList.size() == 1) {
                ansList.add(idxList.get(0));
            } else {
                ansList.add(idxList.get(0));
                ansList.add(idxList.get(1));
            }
        }
        
        // list -> array
        int[] answer = new int[ansList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ansList.get(i);
        }
    
        return answer;
        
    }
}