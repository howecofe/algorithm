class Solution {
    public int[] solution(int[] arr) {
        int val = 1;
        while (true) {
            if (arr.length <= val) { break; }
            val *= 2;
        }
        
        int[] answer = new int[val];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}