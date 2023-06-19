class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. 1부터 n사이가 소수인지 판단 (즉, for문, 2부터 n-1까지)
        for(int i=2; i<=n; i++){   // 1부터 n까지 사이의 수를 돌리자
            // 사이에 있는 수들이 소수이냐?
            Boolean check = true;
        
            // i를 어떤 수로 나누었을 때, 나누어 떨어지면 안됨
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){ // 떨어지면 소수가 아니다. 
                    check=false;
                    break;
                } 
            }
            if(check){
                answer=answer+1;
            }
        }
      
        return answer;
    }
}