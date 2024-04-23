class Solution {
    public int solution(int[] num_list) {       
        int sum = 0;
        int mul = 1;
        for (int num : num_list) {
            mul *= num;
            sum += num;
        }
        
        return mul < sum * sum ? 1 : 0;
    }
}