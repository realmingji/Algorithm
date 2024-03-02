class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
    
        // 문자열 뒤집기
        for(int i = my_string.length()-1; i >= 0; i--){
            // System.out.print(i + " ");
            answer += my_string.charAt(i); 
        }
        
        // n번째까지 자르기
        String substring = answer.substring(0, n);
        System.out.print(substring);
        
        // substring 하고 뒤집기
        answer = "";
        for(int i = substring.length()-1; i >= 0; i--){
            answer += substring.charAt(i); 
        }
        
        return answer;
    }
}