import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
    
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String t : terms) {
            termsMap.put(t.split(" ")[0], Integer.parseInt(t.split(" ")[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] date = privacies[i].split(" ")[0].split("\\.");
            String t = privacies[i].split(" ")[1];
            
            int validYear = Integer.parseInt(date[0]) + (Integer.parseInt(date[1]) + termsMap.get(t) - 1) / 12;
            int validMonth = ((Integer.parseInt(date[1]) + termsMap.get(t)) % 12 == 0) ? 12 : ((Integer.parseInt(date[1]) + termsMap.get(t)) % 12);
            int validDay = Integer.parseInt(date[2]) - 1;
            
            if (validDay == 0) {
                validDay = 28;
                if (validMonth == 1) {
                    validMonth = 12;
                    validYear -= 1;
                } else {
                    validMonth -= 1;
                }
            }
            
            if (validYear > year) { continue; }
            else if (validYear == year) {
                if (validMonth > month) { continue; }
                else if (validMonth == month) {
                    if (validDay >= day) { continue; }
                    else { list.add(i + 1); }
                }
                else { list.add(i + 1); }
            } else {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) { answer[i] = list.get(i); }
        
        return answer;
    }
}