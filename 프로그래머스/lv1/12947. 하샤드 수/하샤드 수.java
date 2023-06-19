class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int a = x;
        
        while(a != 0){
            // 나머지 구하기
            sum = sum + a % 10;     // 10으로 나누면 나머지는 8
            // 몫 구하기
            a = a / 10; // 몫
        }
        System.out.println(a);
        if(!(x%sum==0)){    // 0이 아니면!
            return false;
        }
        
        return answer;
    }
}