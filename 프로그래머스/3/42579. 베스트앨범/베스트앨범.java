import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 노래의 장르를 나타내는 문자열 배열 genres
        // 노래별 재생 횟수를 나타내는 정수 배열 plays
        // 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return

        // 총 재생횟수
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);

        // 재생횟수 높은 순으로 장르 구하기
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));

        // 장르별 재생횟수 높은 2곡 구하기
        List<Integer> ansList = new ArrayList<>();
        
        for (String gen : list) {
            Map<Integer, Integer> playMap = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                // <고유번호, 재생횟수> 저장
                if (genres[i].equals(gen)) playMap.put(i, plays[i]);
            }

            // playMap value 내림차순 -> 같으면 key 오름차순
            List<Integer> playList = new ArrayList<>(playMap.keySet());
            playList.sort((o1, o2) -> playMap.get(o2) - playMap.get(o1) == 0? o1 - o2 : playMap.get(o2) - playMap.get(o1));

            // 상위 2곡 추가
            if (playList.size() == 1) {
                ansList.add(playList.get(0));
            } else {
                ansList.add(playList.get(0));
                ansList.add(playList.get(1));
            }
        }
        
        // list -> array
        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) ans[i] = ansList.get(i);

        return ans;
    }
}