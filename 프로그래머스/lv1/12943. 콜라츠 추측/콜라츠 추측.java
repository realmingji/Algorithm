class Solution {
    public int solution(int num) {
        int answer = 0;
        // 입력 수 => 짝수면 2로 나누기
        // 입력 수 => 홀수면 3을 곱하고 1더하기
        // 1이 될 때까지 반복
        while(num != 1){
             // num이 짝수인 경우
            if(num%2==0) {       // num이 6이면?
                num = num/2;      // a는 몫   
                answer++;
            } 
            else if(num%2==1){       // 홀수
                num=num*3+1;   
                answer++;
            }
            else{       // 500번 반복할 때까지 1이 되지않으면?
                return -1;
            }
        }
        
        return answer;
    }
}