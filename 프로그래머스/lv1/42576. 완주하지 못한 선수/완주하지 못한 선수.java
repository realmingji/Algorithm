import java.util.Arrays;
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";      
        Arrays.sort(participant);       // participant 배열 정렬 
        Arrays.sort(completion);       // completion 배열 정렬 
        // System.out.println(Arrays.toString(participant));
        // System.out.println(Arrays.toString(completion));
        
        // 중복 제거된 배열 생성
        // HashSet<String> set1 = new HashSet<>(Arrays.asList(participant));
        // String[] setparticipants = set1.toArray(new String[set1.size()]);
        
        // HashSet<String> set2 = new HashSet<>(Arrays.asList(completion));
        // String[] setcompletion = set2.toArray(new String[set2.size()]);
        
        //  // 배열 정렬
        // Arrays.sort(setparticipants);
//         Arrays.sort(setcompletion);
        
        for(int i =0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
// import java.util.*;
// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         String answer = "";
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         for(int i =0; i < completion.length; i++){
//             if(!(participant[i].equals(completion[i]))){
//                 return participant[i];
//             }
//         }
//         return participant[participant.length-1];
//     }
// }