import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int boxCnt = score.length / m;
        int[] arr = Arrays.copyOfRange(score, score.length - boxCnt * m, score.length);
        
        for (int i = 0; i < arr.length; i += m) {
            answer += arr[i] * m;
        }
        
        return answer;
    }
}