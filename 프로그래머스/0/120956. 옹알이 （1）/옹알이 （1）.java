import java.util.*;

class Solution {
    public int solution(String[] babbling) {
//         int answer = 0;
//         String[] words = {"aya", "ye", "woo", "ma"};
//         List<String> list = new ArrayList<>();
        
//         // 가능한 모든 문자열 구하기
//         // 1) 단어 1~4개 조합, 2)그 조합을 순서 다르게.
//         for (int i = 0; i < words.length; i++) {
//             list.add(words[i]);
//         }
        
//         for (int i = 0; i < words.length; i++) {
//             for (int j = 0; j < words.length; j++) {
//                 if (j != i) {
//                     list.add(words[i] + words[j]);
//                 }
//             }
//         }
        
//         for (int i = 0; i < words.length; i++) {
//             for (int j = 0; j < words.length; j++) {
//                 if (j != i) {
//                     for (int k = 0; k < words.length; k++) {
//                         if (k != i && k != j) {
//                             list.add(words[i] + words[j] + words[k]);
//                         }
//                     }
//                 }
//             }
//         }
        
//         for (int i = 0; i < words.length; i++) {
//             for (int j = 0; j < words.length; j++) {
//                 if (j != i) {
//                     for (int k = 0; k < words.length; k++) {
//                         if (k != i && k != j) {
//                             for (int l = 0; l < words.length; l++) {
//                                 if (l != i && l != j && l != k) {
//                                     list.add(words[i] + words[j] + words[k] + words[l]);
//                                 }
//                             }
//                         }
//                     }
//                 }
//             }
//         }
        
//         for (String babb : babbling) {
//             for (String word : list) {
//                 if (babb.equals(word)) { answer++; }
//             }
//         }
        
//         return answer;
        
        int answer = 0;
        for (String s : babbling) {
            s = s.replace("aya", "-").replace("ye", "-").replace("woo", "-").replace("ma", "-").replace("-", "");
            if (s.isEmpty()) { answer++; }
        }
        return answer;
    }
}