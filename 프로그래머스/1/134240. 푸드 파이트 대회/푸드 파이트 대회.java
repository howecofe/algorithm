class Solution {
    public String solution(int[] food) {
        String order = "";
        for (int i = 1; i < food.length; i++) {
            order += Integer.toString(i).repeat(food[i] / 2);
        }
        
        String reversed = new StringBuilder(order).reverse().toString();
        
        return order + "0" + reversed;
    }
}