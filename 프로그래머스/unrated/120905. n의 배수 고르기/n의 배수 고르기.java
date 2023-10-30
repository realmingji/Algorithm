import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i]  % n == 0) {
                cnt++;
                // System.out.print(cnt);   // cnt = 3;
            }
        }
        int[] answer = new int[cnt];    // int[3];
        int k = 0;
        
        for(int i=0; i < numlist.length; i++){
            if(numlist[i]  % n == 0) {
                answer[k] = numlist[i];
                System.out.print(answer[k]+" ");
                k++;
            }
        }
        return answer;
    }
}