class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
//         int[] answer = {};
        
//         if (n == 1) {
//             answer = new int[slicer[1] + 1];
//             for (int i = 0; i < answer.length; i++) { answer[i] = num_list[i]; }
//         } else if (n == 2) {
//             int idx = 0;
//             answer = new int[num_list.length - slicer[0]];
//             for (int i = slicer[0]; i < num_list.length; i++) { answer[idx++] = num_list[i]; }
//         } else if (n == 3) {
//             int idx = 0;
//             answer = new int[slicer[1] - slicer[0] + 1];
//             for (int i = slicer[0]; i <= slicer[1]; i++) { answer[idx++] = num_list[i]; }
//         } else {
//             int idx = 0;
//             int len = 0;
//             for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) { len++; }
//             answer = new int[len];
//             for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) { answer[idx++] = num_list[i]; }
//         }
        
//         return answer;
        
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}