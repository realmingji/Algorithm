class Solution {
    public String[] solution(String[] strArr) {
        // 홀수는 대문자, 짝수는 소문자
        for(int i = 0; i<strArr.length; i+=2){  // 짝수
            strArr[i] = strArr[i].toLowerCase();
            System.out.println(strArr[i]);          
        }
        for(int i = 1; i<strArr.length; i+=2){
            strArr[i] = strArr[i].toUpperCase();
            System.out.println(strArr[i]);       
        }
        return strArr;
    }
}