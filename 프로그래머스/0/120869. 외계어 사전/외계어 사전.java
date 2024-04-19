class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (String word : dic) {
            boolean containsAll = true;
            if (word.length() == spell.length) {
                for (String alpha : spell) {
                    if (!word.contains(alpha)) { 
                        containsAll = false;
                        break;
                    }
                }
                if (containsAll) { return 1; }
            }
        }
        
        return 2;
    }
}