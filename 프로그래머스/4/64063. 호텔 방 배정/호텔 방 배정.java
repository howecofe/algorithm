import java.util.*;

class Solution {
    static Map<Long, Long> map = new HashMap<>();
    
    public long[] solution(long k, long[] room_number) {
        int len = room_number.length;
        long[] res = new long[len];
        
        for (int i = 0; i < len; i++) {
            res[i] = findRoom(room_number[i]);
        }

        return res;
    }

    static long findRoom(long roomNumber) {
        // 빈 방인 경우
        if (!map.containsKey(roomNumber)) {
            map.put(roomNumber, roomNumber + 1);
            return roomNumber;
        }

        // 빈 방이 아닌 경우
        long emptyRoom = findRoom(map.get(roomNumber));
        map.put(roomNumber, emptyRoom);
        return emptyRoom;
    }
}