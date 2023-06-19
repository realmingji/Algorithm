import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum=0;
        String s = Integer.toString(n);     // int를 String 타입으로 바꿔주기
        char[] arr = s.toCharArray();   // string을 char 배열로 바꿔준다
        // System.out.println(arr);      // 123 출력
        
        for(int i=0; i<arr.length; i++){
            sum=sum + Character.getNumericValue(arr[i]);
            // System.out.println(s);
        }
        return sum;
    }
}
