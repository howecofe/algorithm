class Solution {
    public String solution(String s) {
//         String[] strArr = s.split(" ", -1);
        
//         for (int i = 0; i < strArr.length; i++) {
//             String word = "";
            
//             if (!strArr[i].isEmpty()) {
//                 if (!('0' <= strArr[i].charAt(0) && strArr[i].charAt(0) <= '9')) {
//                     word += strArr[i].substring(0, 1).toUpperCase();
//                 } else {
//                     word += strArr[i].substring(0, 1);
//                 }
//                 word += strArr[i].substring(1, strArr[i].length()).toLowerCase();
//             }
            
//             strArr[i] = word;
//         }
        
//         return String.join(" ", strArr);
        
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean isFirst = true;
        
        for (String ss : str) {
            answer += isFirst ? ss.toUpperCase() : ss;
            isFirst = ss.equals(" ") ? true : false;
        }
        
        return answer;
    }
}