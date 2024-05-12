import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 문자열 정렬 풀이
//         Arrays.sort(phone_book);
        
//         for (int i = 0; i < phone_book.length - 1; i++) {
//             // if (phone_book[i].equals(phone_book[i + 1].substring(0, phone_book[i].length()))) {
//             //     return false;
//             // }
//             if (phone_book[i + 1].startsWith(phone_book[i])) {
//                 return false;
//             }
//         }
        
//         return true;
        
        // 2. 해시맵 풀이
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        for (String hp : phone_book) {
            for (int i = 1; i < hp.length(); i++) { // 같은 번호가 중복해서 들어있지 않으므로 i 범위에서 hp.length()는 제외 (자기 자신 제외)
                if (map.containsKey(hp.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}