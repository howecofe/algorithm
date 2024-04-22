class Solution {
    public int solution(String myString, String pat) {
//         String str = "";
//         for (String s : myString.split("")) {
//             if (s.equals("A")) { str += "B"; }
//             else if (s.equals("B")) { str += "A"; }
//             else { str += s; }
//         }
        
//         if (str.contains(pat)) { return 1; }
//         else { return 0;}
        
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}