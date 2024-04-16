class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        int idx = 0;
        for (int num : numlist) {
            if (idx == cnt) break;
            
            if (num % n == 0) {
                answer[idx] = num;
                idx++;
            }      
        }
        
        return answer;
    }
}