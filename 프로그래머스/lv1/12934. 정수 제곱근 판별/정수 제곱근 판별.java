class Solution {
    public long solution(long n) {
        // 121은 11의 제곱이다. 이걸 어떻게 아느냐?
        // Math.sqrt 제곱근 공식 맞나?
        // 먼저, 제곱근이 맞으면 x+1의 제곱 리턴
        // 아니라면 -1을 리턴해라
        long answer = 0;

        double result = Math.sqrt(n); // n의 제곱근
        long x = (int) result;
         System.out.println(x); // 11 출력
        
        if(x*x==n){
            return answer = (x+1)*(x+1);
        }else{
            return -1;
        }
       
    }
}