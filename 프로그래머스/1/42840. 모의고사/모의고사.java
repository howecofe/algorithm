import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[4]; // 0: dummy

        // 정답 개수 구하기
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % 5]) score[1]++;
            if (answers[i] == arr2[i % 8]) score[2]++;
            if (answers[i] == arr3[i % 10]) score[3]++;
        }

        // 최댓값 구하기
        int[] copied = Arrays.copyOf(score, 4);
        Arrays.sort(copied);
        int max = copied[3];

        // 1등 구하기
        for (int i = 1; i <= 3; i++) {
            if (score[i] == max) list.add(i);
        }

        // list -> array
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) res[i] = list.get(i);

        return res;
    }
}