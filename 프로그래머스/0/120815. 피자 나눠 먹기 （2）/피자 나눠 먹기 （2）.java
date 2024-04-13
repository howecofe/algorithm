class Solution {
    public int solution(int n) {
        int people = n;
        int pizza = 6;
        
        // 최대공약수
        while (people != 0 && pizza != 0) {
            if (people >= pizza) {
                people = people - pizza;
            } else {
                pizza = pizza - people;
            }
        }
        int gcd = (people == 0) ? pizza : people;
        
        if (n % 6 != 0) return gcd * (n / gcd) * (6 / gcd) / 6; // 최소공배수
        else return n / 6;
    }
}