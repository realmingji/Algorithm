import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        
        // 리스트 생성
        List<Integer> intList = new ArrayList<>();
        // System.out.println(intList);    // []
        
        for(int i = start_num; i < end_num + 1; i++){
            intList.add(i);
        }
        
        System.out.println(intList);    // [3, 4, 5, 6, 7, 8, 9, 10]
        
        // 리스트 크기에 맞는 배열
        int[] answer = new int[intList.size()];
        
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}