class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int size = numbers.length;
        double sum = 0;
        if (1 <= size && size <= 100) {
            for (int num : numbers) {
                if (0 <= num && num <= 1000) {
                    sum += num;
                }
            }
            answer = sum / size;
        }
        
        return answer;
    }
}