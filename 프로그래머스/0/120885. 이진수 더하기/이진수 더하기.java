class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
    
        // 문자열 파라미터를 2진수로 읽어 10진수로 변환 후, 합 구하기
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        
        // 10진수를 2진수 문자열로 바꾸기
        answer = Integer.toString(sum, 2);
        
        return answer;
    }
}