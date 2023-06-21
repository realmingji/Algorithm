// 다시 풀어보기
class Solution {
    public String solution(String s) {
        String answer = "";
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("/1.x : " + x);
            
            if (c == ' ') {
                answer += c;        // answer =  answer + c
                x = 0;
                System.out.println("/2.x : " + x);
            } else {
                if (x % 2 == 0) {
                    answer += Character.toUpperCase(c);
                    System.out.println("/3.x : " + x);
                } else {
                    answer += Character.toLowerCase(c);
                    System.out.println("/4.x : " + x);
                }
                x++;
            }
        }
        return answer;
    }
}