class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            char[] num1 = new char[n];
            char[] num2 = new char[n];
            int idx1 = 0, idx2 = 0;
            for (int j = 0; j < n; j++) {
                if (j >= n - Integer.toBinaryString(arr1[i]).length()) {
                    num1[j] = Integer.toBinaryString(arr1[i]).charAt(idx1++);
                } else {
                    num1[j] = '0';
                }
                
                if (j >= n - Integer.toBinaryString(arr2[i]).length()) {
                    num2[j] = Integer.toBinaryString(arr2[i]).charAt(idx2++);
                } else {
                    num2[j] = '0';
                }
            }
            
            String s = "";
            for (int j = 0; j < n; j++) {
                if (num1[j] == '0' && num2[j] == '0') { s += " "; }
                else { s += "#"; }
            }
            
            answer[i] = s;
        }
        
        return answer;
    }
}