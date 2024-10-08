import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        // String[] str = myStr.replaceAll("[a-c]+", "-").split("-");
        // List<String> testList = new ArrayList<>();
        // for (String s : str) {
        //     if (!s.isEmpty()) { testList.add(s); }
        // }
        // // String[] answer = new String[testList.size()];
        // // for (int i = 0; i < answer.length; i++) {
        // //     answer[i] = testList.get(i);
        // // }
        // String[] answer = testList.toArray(new String[0]);
        // return answer.length == 0 ? new String[]{"EMPTY"} : answer;
        
        myStr = myStr.replaceAll("[a|b|c]+", "-"); // [abc]+, [a|b|c]+, [a-c]+
        myStr = myStr.charAt(0) == '-' ? myStr.substring(1) : myStr;
        myStr = myStr.length() == 0 ? "EMPTY" : myStr;
        return myStr.split("-");
    }
}