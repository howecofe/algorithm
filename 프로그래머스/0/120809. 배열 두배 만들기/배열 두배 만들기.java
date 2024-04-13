class Solution {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        int[] answer = new int[size];
        
        if (1 <= size && size <= 1000) {
            for (int i = 0; i < size; i++) {
                if (-10000 <= numbers[i] && numbers[i] <= 10000) {
                    answer[i] = numbers[i] * 2;
                }
            }
        }
        
        return answer;
    }
}