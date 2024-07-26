import java.util.*;

class Solution {
    static List<Integer[]> timeList = new ArrayList<>(); // 입장 & 퇴장시간 쌍으로 기록
    static List<Integer> roomList = new ArrayList<>(); // 퇴장시간만 기록
    
    public int solution(String[][] bookTime) {
        // 예약 시각을 분으로 바꾸기
        timeToMinute(bookTime);

        // 입장시간으로 정렬
        timeList.sort((o1, o2) -> o1[0] - o2[0]);

        for (Integer[] time : timeList) {
            int start = time[0];
            int end = time[1];
            boolean replaced = false;

            for (int i = 0; i < roomList.size(); i++) {
                // 입장 가능한 다음 예약이 있으면 해당 예약의 퇴장시간으로 갱신 후 break
                if (roomList.get(i) <= start) {
                    roomList.set(i, end);
                    replaced = true;
                    break;
                }
            }

            // 입장 가능한 다음 예약이 하나도 없으면 새로운 room으로 추가
            if (!replaced) roomList.add(end);
        }

        return roomList.size();
    }

    static void timeToMinute(String[][] bookTime) {
        for (String[] t : bookTime) {
            String[] start = t[0].split(":");
            String[] end = t[1].split(":");

            int startMin = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
            int endMin = Integer.parseInt(end[0]) * 60 + Integer.parseInt(end[1]) + 10; // 청소시간 10분 더하기

            timeList.add(new Integer[]{startMin, endMin});
        }
    }
}