class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b){        // b가 크면
            for(int i=a; i<=b; i++){
                answer=answer+i;
            }
        }
        else if(a==b){
            answer = a;
        }
        else{
            for(int i=b; i<=a;i++){
                answer=answer+i;
            }
        }
        return answer;
    }
}