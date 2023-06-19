class Solution {
    public int solution(int n) {
        int answer = 0;
        // int는 약수의 개수(1이랑 자기자신)
        
        // 2부터 n까지 수
        for(int i=2; i<=n; i++){ 
            
            Boolean check = true;
        
            // 만약에 5라고 가정 -> J: 2, 3까지 간다.
            // 만약에 6이면      -> 2
            
            // for문은 소수인지 아닌지 판별해주는 코드다. (중요)
            for(int j=2; j<=Math.sqrt(i); j++){
                 // 만약에 5를 2와 3으로 나누면 나누어 떨어지지 않아서 소수다!
                // 만약에 6이면 2로 나누어 떨어지니깐 소수가 아니다!
                if(i%j==0){ 
                    check=false;
                    break; 
                }
            }
            // check가 true이면 answer+=1을 해라
            if(check){ answer=answer+1;}
        }
        return answer;
    }
}