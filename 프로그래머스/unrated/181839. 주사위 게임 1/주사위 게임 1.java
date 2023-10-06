class Solution {
    public int solution(int a, int b) {
        int c = 0;
       
        if(a % 2 == 1 && b % 2 == 1){    // a와 b 홀수 -> 제곱해서 더하기
            c = (a*a) + (b*b);
        } else if(a % 2 == 1 || b % 2 == 1) {   // a와 b 둘 중 하나가 홀수 ->  2 × (a + b) 
            c = 2 * (a+b);
        } else{
            c = Math.abs(a - b);
        }
        return c;
    }
}