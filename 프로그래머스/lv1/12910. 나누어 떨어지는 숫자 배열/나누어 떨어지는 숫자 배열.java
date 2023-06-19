import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            list.add(-1);                
        }
        sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}




// import java.util.ArrayList;
// import java.util.List;
// import static java.util.Collections.*;

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         // int[] answer = {};
//         ArrayList<Integer> list = new ArrayList<Integer>();
        
//         // divisor으로 나누었을 때 떨어지는 값을 구하기
//         for(int i=0; i<arr.length;i++){
//             if(arr[i]%divisor==0){
//                 list.add(arr[i]);
//                 // System.out.println(list);
//             }
//             // else를 사용하면 arr 안에 있는 숫자 중 divisor로 나눌 수 없는 값들도 -1로 초기화 된다.
//             // 예를 들어 [5, -1, -1, 10] 이렇게 된다.
//             //else{       
//             //     list.add(-1);
//             //     System.out.println(list);
//             // } 
//         }
//         if(list.size() == 0){
//             list.add(-1);                
//             // System.out.println(list);
//         }
//         sort(list);     // list 정렬 [1, 2, 3, 36]
//         // System.out.println(list);
        
//         // 배열로 바꿔주자
//         int[] answer = new int[list.size()];
        
//         for(int i=0; i<list.size(); i++){
//             answer[i] = list.get(i);
//         }
//         return answer;
//     }
// }