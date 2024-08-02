import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int left = 0;
        int right = people.length - 1;

        // left가 right를 넘으면 모든 사람이 다 탔다는 뜻
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++; // left 사람 태움
            }

            right--; // right 사람은 항상 태움
            cnt++;
        }

        return cnt;
    }
}