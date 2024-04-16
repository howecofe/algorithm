class Solution {
    public int solution(int[] sides) {
        
        // 최댓값과 그 인덱스 구하기
        int max = sides[0];
        int maxIdx = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
                maxIdx = i;
            }
        }
        
        // 최댓값 제외한 나머지의 합 구하기
        int sum = 0;
        for (int j = 0; j < sides.length; j++) {
            if (j != maxIdx) sum += sides[j];
        }
        
        return (sides[maxIdx] < sum) ? 1 : 2;
    }
}