import java.util.*;
import static java.util.Collections.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // 먼저 String으로 바꿔주자
        String s = Long.toString(n);
        
        char[] arr = s.toCharArray();
        char[] reversedArr = new char[arr.length];        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            reversedArr[arr.length-1-i]=arr[i];
        }
        
        String reversedStr = new String(reversedArr);
        answer=Long.parseLong(reversedStr);
        // System.out.println(reversedStr);
        // System.out.println(s);    // 112378
   

        return answer;
    }
}