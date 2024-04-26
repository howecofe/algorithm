class Solution {
    public int solution(int[] numbers) {
        int[] cnt = new int[10];
        for (int n : numbers) { cnt[n]++; }
        
        int answer = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) { answer += i; }
        }
        return answer;
    }
}