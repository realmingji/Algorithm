// import java.util.Arrays;
// import java.util.*;
// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         String answer = "";
        
//         Arrays.sort(participant);       // participant 배열 정렬 
//         Arrays.sort(completion);       // completion 배열 정렬 
// //         System.out.println(Arrays.toString(participant));
// //         System.out.println(Arrays.toString(completion));
        
//         // Set set =new HashSet();
//         // for(int j=0; j<participant.length; j++){
//         //     set.add(participant[j]);
//         //     System.out.println(set);
//         // }
        
//         // 중복 제거된 배열 생성
//         HashSet<String> set1 = new HashSet<>(Arrays.asList(participant));
//         String[] setparticipants = set1.toArray(new String[set1.size()]);
        
//         // HashSet<String> set2 = new HashSet<>(Arrays.asList(completion));
//         // String[] setcompletion = set2.toArray(new String[set2.size()]);
        
//          // 배열 정렬
//         Arrays.sort(setparticipants);
// //         Arrays.sort(setcompletion);
        
//         for(int i=0; i<completion.length; i++){ // i가 0부터 시작해서 completion 길이까지 반복해라
//             if(!(setparticipants[i].equals(completion[i]))){  // 같지 않으면
//                 return setparticipants[i];  //  participant[i] 리턴해라
//             }
//             return participant[setparticipants.length - 1];
//         }
//         return answer;
//     }
// }
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i =0; i < completion.length; i++){
            if(!(participant[i].equals(completion[i]))){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}