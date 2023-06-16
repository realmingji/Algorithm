class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();    // s=abcde 
        
        if(length%2==0){    // 짝수면
            answer = s.substring(length/2-1, length/2+1);
        } else{
            answer = s.substring(length/2, length/2+1) ;
        }
        return answer;
    }
}