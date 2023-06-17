class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        // a는 5일 경우
        for (int i=0; i<a-1; i++) {     // i < 4 이니깐 0, 1, 2, 3까지 돌려라
            sum = sum + month[i];       // 달 전체를 더하고
        }   // 합은 121
        
        sum=sum+(b-1);  // b-1은 주어진 전날, 즉 b-1은 23
        
        return answer = day[(sum % 7)];
    }
}