class Solution {
    public int solution(int a, int b) {
        int answer1 = 0, answer2 = 0;
        String sum1, sum2;
        
        sum1 = Integer.toString(a) + Integer.toString(b);
        sum2 = Integer.toString(b) + Integer.toString(a);
        
        answer1 = Integer.parseInt(sum1);
        answer2 = Integer.parseInt(sum2);
        if(answer1 > answer2){
            return answer1;
        } else{
            return answer2;
        }
    }
}