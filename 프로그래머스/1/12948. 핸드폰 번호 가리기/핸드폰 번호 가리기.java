class Solution {
    public String solution(String phone_number) {
        String masking = phone_number.substring(0, phone_number.length() - 4);
        return phone_number.replace(masking, "*".repeat(masking.length()));
    }
}