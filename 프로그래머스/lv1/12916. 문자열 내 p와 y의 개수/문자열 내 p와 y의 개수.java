class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p =0, y=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                p = p + 1;
            }
             if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                y = y + 1;
            }
        }
        if(!(p == y)){ return false;}
        return answer;

    }
}
