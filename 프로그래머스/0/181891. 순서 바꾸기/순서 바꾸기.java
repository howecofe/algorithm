class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < answer.length; i++) {
            if (i <= num_list.length-n-1) { answer[i] = num_list[i + n]; }
            else { answer[i] = num_list[i + n - num_list.length]; }
        }
        
        return answer;
    }
}