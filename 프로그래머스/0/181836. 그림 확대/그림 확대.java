class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (int i = 0; i < picture.length; i++) {
            String s = "";
            for (int j = 0; j < picture[0].length(); j++) {
                s += Character.toString(picture[i].charAt(j)).repeat(k);
            }
            
            for (int j = 0; j < k; j++) {
                answer[idx++] = s;
            }
        }
        
        return answer;
    }
}