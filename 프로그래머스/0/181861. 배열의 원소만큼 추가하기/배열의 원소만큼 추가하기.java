class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for (int num : arr) { size += num; }
        int[] X = new int[size];
        
        int idx = 0;
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                X[idx++] = num;
            }
        }

        return X;
    }
}