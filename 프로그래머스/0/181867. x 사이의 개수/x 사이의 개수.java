import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] ch = myString.split("x", -1);
        int[] answer = new int[ch.length];
        
         for (int i = 0; i < ch.length; i++) {
            answer[i] = ch[i].length();
        }

        return answer;
    }
}
