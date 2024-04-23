class Solution {
    public int solution(int[] arr, int idx) {
        if (idx <= arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                if (idx <= i && arr[i] == 1) { return i; }
            }
        }
        
        return -1;
    }
}