import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // map에 emergency 값과 인덱스 정보 저장하기
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }
        
        // emergency[] 정렬
        Arrays.sort(emergency);
        
        // map에 저장된 인덱스 정보로 진료순서 저장
        int rank = emergency.length;
        for (int i = 0; i < emergency.length; i++) {
            answer[map.get(emergency[i])] = rank--;
        }

        return answer;
    }
}