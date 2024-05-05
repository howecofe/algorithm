class Solution {
    public int[] solution(int brown, int yellow) {
        int width = 0, height = 0;
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                height = i + 2;
                width = yellow / i + 2;
                if (height * width - yellow == brown) {
                    break;
                }
            }
        }
        
        return new int[]{width, height};
    }
}