class Solution {
    public String solution(String my_string) {
//         String answer = "";
//         String[] vowel = {"a", "e", "i", "o", "u"};
        
//         for (String str : my_string.split("")) {
//             boolean isVowel = false;
//             for (String v : vowel) {
//                 if (str.equals(v)) {
//                     isVowel = !isVowel;
//                     break;
//                 }
//             }
//             if (!isVowel) answer += str;
//         }
        
//         return answer;
        return my_string.replaceAll("[aeiou]", "");
    }
}