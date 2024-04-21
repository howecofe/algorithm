class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] str = polynomial.split(" ");
        
        int xSum = 0;
        int sum = 0;
        for (int i = 0; i < str.length; i += 2) {
            if (str[i].contains("x")) {
                if (str[i].charAt(0) == 'x') {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(str[i].substring(0, str[i].length() - 1));
                }
            } else {
                sum += Integer.parseInt(str[i]);
            }
        }
        
        if (xSum == 0 && sum != 0) {
            answer = String.valueOf(sum); 
        } else if (xSum != 0 && sum == 0) {
            if (xSum == 1) {
                answer = "x";
            } else {
                answer = String.valueOf(xSum) + "x";
            }  
        } else if (xSum == 0 && sum == 0) {
            answer = "0";
        } else {
            if (xSum == 1) {
                answer = "x + " + String.valueOf(sum);
            } else {
                answer = String.valueOf(xSum) + "x + " + String.valueOf(sum);
            }  
        }
        
        return answer;
    }
}