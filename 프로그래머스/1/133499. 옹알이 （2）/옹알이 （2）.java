class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (String w : words) {
                if (!babbling[i].contains(w.repeat(2))) { babbling[i] = babbling[i].replace(w, " "); } 
            }
        }
        
        int answer = 0;
        for (String s : babbling) {
            s = s.replace(" ", "");
            if (s.isEmpty()) { answer++; }
        }
        
        return answer;
    }
}