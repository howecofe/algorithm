class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] myString = my_string.split(" ");
        answer += Integer.parseInt(myString[0]);
        for (int i = 1; i < myString.length; i += 2) {
            if (myString[i].equals("+")) {
                answer += Integer.parseInt(myString[i + 1]);
            } else {
                answer -= Integer.parseInt(myString[i + 1]);
            }
        }
        
        return answer;
    }
}