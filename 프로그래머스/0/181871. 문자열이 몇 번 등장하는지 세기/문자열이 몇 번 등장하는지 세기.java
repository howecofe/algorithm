class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        // for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
        //     if (myString.substring(i, i + pat.length()).equals(pat)) { cnt++; }
        // }
        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i).startsWith(pat)) { cnt++; }
        }
        return cnt;
    }
}