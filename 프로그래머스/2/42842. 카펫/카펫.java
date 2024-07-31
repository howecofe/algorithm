class Solution {
    static int[] ans = new int[2]; // w, h
    
    public int[] solution(int brown, int yellow) {

        // yellow의 (w,h) 조합을 구하기 위해 약수 구하기
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                // w >= h
                int h = i + 2;
                int w = yellow / i + 2;
                int brownCnt = w * h - yellow;

                if (brownCnt == brown) {
                    ans[0] = w;
                    ans[1] = h;
                    break;
                }
            }
        }

        return ans;
    }
}