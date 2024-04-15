import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger numer = new BigInteger("1");
        BigInteger denom = new BigInteger("1");
        
        for (int i = 1; i <= balls; i++) {
            numer = numer.multiply(BigInteger.valueOf(i));
        }
        
        for (int j = 1; j <= balls-share; j++) {
            denom = denom.multiply(BigInteger.valueOf(j));
        }
        
        for (int k = 1; k <= share; k++) {
            denom = denom.multiply(BigInteger.valueOf(k));
        }
        
        return numer.divide(denom).intValue();
    }
}