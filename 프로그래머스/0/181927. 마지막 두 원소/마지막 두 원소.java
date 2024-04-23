class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int num = 0;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            num = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            num = num_list[num_list.length - 1] * 2;
        }
        
        for (int i = 0; i < answer.length; i++) {
            if (i == answer.length - 1) { answer[i] = num; }
            else { answer[i] = num_list[i]; }
        }
        return answer;
    }
}