class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int result = Integer.parseInt(str[0]) + (Integer.parseInt(str[2]) * (str[1].equals("+") ? 1 : -1));
            
            answer[i] = result == Integer.parseInt(str[4]) ? "O" : "X";
        }
        
        return answer;
    }
}