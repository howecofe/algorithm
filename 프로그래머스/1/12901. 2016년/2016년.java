class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (i == 2) { sum += 29; }
            else if (i == 4 || i == 6 || i == 9 || i == 11) { sum += 30; }
            else { sum += 31; }
        }
        sum += b;
        
        return days[(sum - 1) % 7];
    
    }
}