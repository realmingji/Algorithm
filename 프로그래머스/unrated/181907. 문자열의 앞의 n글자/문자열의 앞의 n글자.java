class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0,n);  //0부터 n까지 문자열 반환
        return answer;
    }
}