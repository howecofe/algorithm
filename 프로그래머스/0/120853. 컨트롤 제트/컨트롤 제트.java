class Solution {
    public int solution(String s) {
        int sum = 0;
        int prev = 0;
        
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                sum -= prev;
            } else {
                prev = Integer.valueOf(str);
                sum += prev;
            }
        }
        
        return sum;
    }
}