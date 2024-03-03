class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int index = 0;
        
        for(int i=0; i<num_list.length; i++) {
            answer[index] = num_list[i];
            index++;
        }
        
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) { // 마지막 원소가 클 때
            answer[index] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {    // 마지막 원소가 작을 때
            answer[index] = num_list[num_list.length-1] * 2;
        }
        return answer;
    }
}