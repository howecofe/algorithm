import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int ing : ingredient) {
            sb.append(ing);
            if (sb.length() >= 4 && sb.substring(sb.length() - 4).equals("1231")) {
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }
        return answer;
    }
}

// [참고] https://programmer-may.tistory.com/154