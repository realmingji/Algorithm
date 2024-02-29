import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];
        int index = 0;
        for(int i = 0; i < my_string.length(); i++) {
            int asc = my_string.charAt(i) - '0';
            System.out.println("asc = " + asc);
            
            if(asc < 49) { 
                answer = Arrays.copyOf(answer, index + 1);
                answer[index] = asc;
                index++;
                System.out.println("answer : " + asc);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
