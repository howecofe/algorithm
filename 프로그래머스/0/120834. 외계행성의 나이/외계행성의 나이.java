class Solution {
    public String solution(int age) {
 
        StringBuilder sb = new StringBuilder();
        
        while (age > 0) { // 제한사항: age는 자연수이다.
            sb.insert(0, (char) (age % 10 + (int)'a'));
            age /= 10;
        }
        
        return sb.toString();
    }
}