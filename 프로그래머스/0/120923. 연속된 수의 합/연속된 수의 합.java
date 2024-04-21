class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // firstNum * num + (num - 1) * num / 2 = total;
        int firstNum = (total - ((num - 1) * num / 2)) / num;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = firstNum++;
        }
        
        return answer;
    }
}