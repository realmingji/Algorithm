// import java.util.*;
// // 1) t는 p의 길이 만큼 자르기
// // 2) p보다 작은 수 구하고 cnt 사용해서 갯수 알아오기 
// class Solution {
//     public int solution(String t, String p) {
//         int len = p.length();   // len은 p 길이 저장하는 변수
//         System.out.println("len " + len);
        
//         int strArraySize = (int) Math.ceil((double)t.length() / len);
//         System.out.println("t " + t);
//         System.out.println("strArraySize " + strArraySize);
        
//         String[] subStringArray = new String[strArraySize];
//         System.out.println("subStringArray " + Arrays.toString(subStringArray));
        
//         int index = 0;
//         for(int startIndex = 0; startIndex < t.length(); startIndex = startIndex+ len) {
//             subStringArray[index++] = t.substring(startIndex, Math.min(startIndex + len, t.length()));
//         }
//         System.out.println("subStringArray " + Arrays.toString(subStringArray));
        
//         int cnt = 0;
//          for (int i = 0; i <= t.length() - len; i++) {
//             String sub = t.substring(i, i + len); // t에서 길이가 len인 부분 문자열 추출
//             int numT = Integer.parseLong(sub);
//             int numP = Long.parseLong(p);
            
//             if (numT <= numP) {
//                 cnt++;
//             }
//         }
        
//         return cnt;
//     }
// }

import java.math.BigInteger;

class Solution {
        public int solution(String t, String p) {
        int answer = 0;
        Long len = Long.parseLong(p);
        for(int i=0; i<=t.length() - p.length(); i++) {
            Long tss = Long.parseLong(t.substring(i, i+p.length()));
            if(len >= tss) {
                answer++;
            }
        }

        return answer;
    }
}
