import java.util.*;
// 정수를 저장한 배열
// arr에서 가장 작은 수 제거하는 리턴 함수
// 큰 수부터 정렬하고 마지막에 있는걸 제거하면 된다.
// [4,3,2,1]인 경우 [4,3,2] 리턴한다. [10]인 경우 [-1] 리턴한다.

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] newArr = new int[arr.length-1];   // 작은 수 제거 arr.length-1
        
        // 배열에서 가장 작은 수 구하기
        int min = arr[0];       // 배열 값 저장
        
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            // list.add(arr[i]); 
            // System.out.println(list);   // [4, 3, 2, 1]
        }
        
        // 저 값을 뺀 나머지 출력해보자
       for (int i = 0; i < arr.length; i++) {
             if (arr[i] != min) {   // min이 아니라면 list.add(arr[i]);
                list.add(arr[i]);
            }
        }
        
        // 배열 길이가 1일때 [-1]을 리턴
        if(arr.length == 1){
            list.add(-1);             
            System.out.println(list);   // [4, 3, 2, 1]
        }
        
        // 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;

    }
}