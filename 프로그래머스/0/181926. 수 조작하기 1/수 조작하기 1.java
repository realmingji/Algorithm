import java.util.*;
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        // 문자 배열 생성
        char[] c_arr = new char[control.length()];
        
        for(int i=0; i<control.length(); i++){
            c_arr[i] = control.charAt(i);
        }
        
        for(int i=0; i<c_arr.length; i++){
            if(c_arr[i] == 'w') {
                n=n+1;
            } 
            else if (c_arr[i] == 's') {
                n=n-1;
            } 
            else if (c_arr[i] == 'd') {
                n=n+10;
            }
            else if(c_arr[i] == 'a'){
                n=n-10;
            }
        }
        answer = n;
        return answer;
    }
}