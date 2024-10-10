class Solution {
    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; // (w, h) w >= h
        
        
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            // yellow w,h 구하기 (약수)
            int n1 = 0, n2 = 0;
            
            if (yellow % i == 0) {
                n1 = i;
                n2 = yellow / i;
            }
            
            // yellow w,h에 따른 brown 수 매칭 확인
            int w = n2 + 2;
            int h = n1 + 2;
            if (yellow + brown == w * h) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        
        return answer;
    }
}