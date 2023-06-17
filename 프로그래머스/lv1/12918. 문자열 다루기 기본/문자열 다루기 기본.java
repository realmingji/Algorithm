class Solution {
    public boolean solution(String s) {
        // 먼저 4글자냐 6글자냐 조건문 사용하기
        if(s.length() == 4 || s.length()==6){ 
            for(int i=0; i<s.length(); i++){
              if(s.charAt(i) >= 'A')
              return false;
        }
            return true;
        }
        else{return false;}
        
        
    }
}