// 먼저 공백을 만날때까지 돌려라
// 만약에 공백을 만났다? => 
// 다시 풀어보기
class Solution {
    public String solution(String s) {
        String answer = "";
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
 
            if (c == ' ') {
                answer += c;
                System.out.print(answer);
                x = 0;
                // System.out.print(x);
            } else {
                if (x % 2 == 0) {
                    answer += Character.toUpperCase(c);
                    // System.out.print(x);
                } else {
                    answer += Character.toLowerCase(c);
                }
                x++;
            }
        }
        return answer;
    }
}