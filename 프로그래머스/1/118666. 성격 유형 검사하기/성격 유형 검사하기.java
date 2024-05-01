import java.util.*;

class Solution {
    private Map<Character, Integer> map;
    
    public Solution() {
        this.map = new HashMap<>();
    }
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[]{3, 2, 1, 0, 1, 2, 3};
        
        for (int i = 0; i < survey.length; i++) {
            char sv = survey[i].charAt(0);
            if (choices[i] > 4) { sv = survey[i].charAt(1); }
            
            map.put(sv, map.getOrDefault(sv, 0) + score[choices[i] - 1]);
        }
        
        answer += getIndicator('R', 'T');
        answer += getIndicator('C', 'F');
        answer += getIndicator('J', 'M');
        answer += getIndicator('A', 'N');
        
        return answer;
    }
    
    private char getIndicator(char id1, char id2) {
        int id1Score = map.getOrDefault(id1, 0);
        int id2Score = map.getOrDefault(id2, 0);
        
        if (id1Score > id2Score) { return id1; }
        else if (id2Score > id1Score) { return id2; }
        else { return id1 < id2 ? id1 : id2; }
    }
}