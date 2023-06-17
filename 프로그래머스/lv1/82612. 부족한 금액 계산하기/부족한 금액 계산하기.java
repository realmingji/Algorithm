class Solution {
    public long solution(int price, int money, int count) {
        // price의 count 제곱 > money      => return 제곱 - money
        // 금액이 부족하지 않으면?      => return 0
        // count 길이만큼 더하기 => 
        // 3+6+9+12 
        long total = 0;                 // total을 0으로 초기화
        
        for(int i=1; i<=count; i++){
           total=total+(price*i);          // tatal=total+(3*1)
        }
        
        if(total >= money){
            return total - money;
        }else{
            return 0;
        }
    }
}