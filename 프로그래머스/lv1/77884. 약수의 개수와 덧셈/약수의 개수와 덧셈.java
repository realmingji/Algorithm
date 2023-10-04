// 약수란? 1과 내 자신을 가지기
// 약수 개수가 짝수면 더하고 홀수면 빼기
// 첫번째) left부터 right+1 범위 구하기
// 두번째) 약수를 구하고, 개수가 짝수인지 홀수인지 판별하기
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<right+1; i++){
            int range = i;    // range는 left부터 right+1 범위
            // System.out.print("범위"+range+" ");
            int cnt = 0;        // cnt는 약수 개수 저장해주는 변수
            
            // 약수 구하는 공식
            for(int j=1; j<=range+1; j++){
                if(range % j == 0){
                    int divisor = j;         // divisor은 약수
                    // System.out.println("약수"+divisor+" ");
                    cnt++;
                    // System.out.println("divisor" + cnt);
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}