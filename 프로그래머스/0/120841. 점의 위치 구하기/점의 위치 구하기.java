class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int mul = dot[0] * dot[1];
        
        if (mul > 0) {
            answer = (dot[0] > 0) ? 1 : 3;
        } else {
            answer = (dot[0] > 0) ? 4 : 2;
        }
        
        return answer;
    }
}