import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String subStr = t.substring(i, i + p.length());
            if (new BigInteger(subStr).compareTo(new BigInteger(p)) <= 0) { answer++; }
        }
        return answer;
    }
}