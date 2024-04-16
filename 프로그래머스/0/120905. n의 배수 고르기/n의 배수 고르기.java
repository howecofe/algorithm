class Solution {
    public int[] solution(int n, int[] numlist) {
        int size = numlist.length;
        
        // n의 배수가 아닌 값을 0으로 만들기
        for (int i = 0; i < numlist.length; i ++) {
            if (numlist[i] % n != 0) {
                numlist[i] = 0;
                size--;
            }
        }
        
        // 0이 아닌 값(n의 배수)을 새로운 배열에 저장하기
        int[] answer = new int[size];
        int idx = 0;
        for (int j = 0; j < numlist.length; j++) {
            if (idx == size) break;
            
            if (numlist[j] != 0) {
                answer[idx] = numlist[j];
                idx++;
            }      
        }
        
        return answer;
    }
}