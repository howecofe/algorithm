class Solution {
    public int solution(String binomial) {
        String[] binom = binomial.split(" ");
        int a = Integer.parseInt(binom[0]);
        int b = Integer.parseInt(binom[2]);
        
        if (binom[1].equals("+")) { return a + b; }
        else if (binom[1].equals("-")) { return a - b; }
        else { return a * b; }
    }
}