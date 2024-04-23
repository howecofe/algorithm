class Solution {
    public String solution(String myString) {
//         String answer = "";
    
//         myString = myString.replace("a", "A");
//         for (char c : myString.toCharArray()) {
//             if ('B' <= c && c <= 'Z') {
//                 answer += Character.toLowerCase(c);
//             } else {
//                 answer += c;
//             }
//         }
        
//         return answer;
        
        return myString.toLowerCase().replace("a", "A");
    }
}