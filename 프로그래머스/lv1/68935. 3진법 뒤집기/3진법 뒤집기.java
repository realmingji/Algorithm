// 45는 3으로 나누면 몫이 15 나온다. 나머지 0이다.
// 15를 3으로 나누면 몫이 5이 된다. 나머지 0이다.
// 5를 3으로 나누면 몫은 1이다. 나머지 2이다. => 이건 결국엔 3진법이 안 됨
// 0이 나올때까지 하는거잖아? 몫이 0이 되면 그만

class Solution {
    public int solution(int n) {
        String str = "";
        int a = 0, b = 0;     // a는 몫, b는 나머지
        
        while(n>0){
            a = n / 3; 
            b = n % 3;      // 나머지는 0, 1, 2가 나와요
            str = b + str;
            n = a;
        }
        int answer = Integer.parseInt(new StringBuilder(str).reverse().toString(), 3);
        return answer;
    }
}
