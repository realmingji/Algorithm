class Solution {
    public String solution(int n) {
        String answer = "";
        // 짝수면 "수"로 끝나고, 홀수면 "박"으로 끝난다.
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                answer=answer+"수";
            }else{
                answer=answer+"박";
            }
        }
        return answer;
    }
}