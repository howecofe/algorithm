import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list에 1을 제외한 약수를 저장한다.
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        
        // list의 각 요소에 약수가 있는지 찾고, 있으면 삭제한다. (소수가 아닌 요소 삭제)
        for (int i = 0; i < list.size(); i++) {
            for (int j = 2; j < list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        
        // answer로 옮겨 오름차순 정렬
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}