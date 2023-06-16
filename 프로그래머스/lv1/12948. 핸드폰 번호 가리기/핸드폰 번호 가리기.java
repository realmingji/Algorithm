class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // String end = phone_number.substring(phone_number.length()-4, phone_number.length());    // 4444 출력
        // String start = phone_number.substring(phone_number.length(), phone_number.length()-4);
        int length=phone_number.length()-4;
        for(int i=0; i<length;i++){
            answer = answer + "*";
        }
        return answer = answer+phone_number.substring(length);
    }
}