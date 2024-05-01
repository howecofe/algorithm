class Solution {
    public int solution(int[] ingredient) {
        // 1. StringBuilder 사용
//         int answer = 0;
//         StringBuilder sb = new StringBuilder();
        
//         for (int ing : ingredient) {
//             sb.append(ing);
//             if (sb.length() >= 4 && sb.substring(sb.length() - 4).equals("1231")) {
//                 sb.delete(sb.length() - 4, sb.length());
//                 answer++;
//             }
//         }
//         return answer;
        
        // 2. Stack 배열 사용
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int idx = 0;
        
        for (int ing : ingredient) {
            stack[idx++] = ing;
            
            if (idx >= 4
                && stack[idx - 1] == 1 
                && stack[idx - 2] == 3 
                && stack[idx - 3] == 2 
                && stack[idx - 4] == 1) {
                answer++;
                idx -= 4;
            }
        }
        
        return answer;
    }
}

// [참고] https://programmer-may.tistory.com/154