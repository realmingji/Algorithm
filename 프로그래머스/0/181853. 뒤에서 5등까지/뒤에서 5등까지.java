class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int tmp;
        
        // 정렬하는 for문
        for(int i=0; i<num_list.length; i++){
           for(int j=i+1; j<num_list.length; j++){
               if(num_list[i]>num_list[j]){
                   tmp = num_list[j];
                   num_list[j] = num_list[i];
                   num_list[i] = tmp;
                   // System.out.println(num_list[i] + " " + num_list[j] + " ");
               }
           }
        }
        
        // 5개 값만 배열에 저장
        for(int i = 0; i < 5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}