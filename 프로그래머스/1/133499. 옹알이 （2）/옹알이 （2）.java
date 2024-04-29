class Solution {
    public int solution(String[] babbling) {
        int answer = babbling.length;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (String w : words) {
                if (!babbling[i].contains(w.repeat(2))) { babbling[i] = babbling[i].replace(w, "-"); } 
            }
        }
        
        for (String s : babbling) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '-') { answer--; break;}
            }
        }
        
        return answer;
    }
}