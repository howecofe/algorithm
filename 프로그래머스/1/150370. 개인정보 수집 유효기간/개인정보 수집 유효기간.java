import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
    
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        int currDays = getDays(year, month, day);
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String t : terms) {
            termsMap.put(t.split(" ")[0], Integer.parseInt(t.split(" ")[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] date = privacies[i].split(" ")[0].split("\\.");
            String t = privacies[i].split(" ")[1];
            
            // 일수로 비교하기
            int yyyy = Integer.parseInt(date[0]);
            int mm = Integer.parseInt(date[1]) + termsMap.get(t);
            int dd = Integer.parseInt(date[2]);
            int validDays = getDays(yyyy, mm, dd) - 1;
            
            if (validDays < currDays) { list.add(i + 1); }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        
        return answer;
    }
    
    private int getDays(int year, int month, int day) {
        return year * 12 * 28 + month * 28 + day;
    }
}