import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        List<int[]> camera = new ArrayList<>();

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int end = 0, start = 0;

        for (int i = 0; i < routes.length; i++) {
            start = routes[i][0];
            end = routes[i][1];
            boolean replaced = false;

            for (int j = 0; j < camera.size(); j++) {
                int s = camera.get(j)[0];
                int e = camera.get(j)[1];
                if (start <= e) {
                    int[] arr = {s, e, start, end};
                    Arrays.sort(arr);
                    camera.set(j, new int[]{arr[1], arr[2]}); // 교집합으로 갱신
                    replaced = true;
                }
            }

            if (!replaced) camera.add(new int[]{start, end});
        }

        return camera.size();
    }
}