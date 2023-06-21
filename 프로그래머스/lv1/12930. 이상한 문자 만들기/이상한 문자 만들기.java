// 먼저 공백을 만날때까지 돌려라
// 만약에 공백을 만났다? => 
class Solution {
    public String solution(String s) {
        String answer = "";
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += c;
                x = 0;
            } else {
                if (x % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                x++;
            }
        }
        return answer;
    }
}