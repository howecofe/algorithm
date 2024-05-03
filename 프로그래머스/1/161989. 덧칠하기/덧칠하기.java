class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        
        while (section[section.length - 1] > painted) {
            answer++;
            for (int num : section) {
                if (num > painted) {
                    painted = num + m - 1;
                    break;
                }
            }
        }        
        
        return answer;
    }
}