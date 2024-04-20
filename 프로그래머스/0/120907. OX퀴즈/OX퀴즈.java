class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int result = Integer.parseInt(str[0]);
            
            if (str[1].equals("+")) { result += Integer.parseInt(str[2]); }
            else { result -= Integer.parseInt(str[2]); }
            
            if (result == Integer.parseInt(str[4])) { answer[i] = "O"; }
            else { answer[i] = "X"; }
        }
        
        return answer;
    }
}