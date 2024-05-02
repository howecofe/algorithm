import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) { map.put(players[i], i); }
        
        for (String call : callings) {
            players[map.get(call)] = players[map.get(call) - 1];
            map.put(players[map.get(call) - 1], map.get(call));
            
            players[map.get(call) - 1] = call;
            map.put(call, map.get(call) - 1);
        }
        
        return players;
    }
}