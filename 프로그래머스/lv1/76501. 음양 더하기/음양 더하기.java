class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<absolutes.length; i++){
            if(signs[i]){   // signs[0] 이면
                answer=answer+absolutes[i];
            }else{  // signs[1] 이면
                answer=answer+(-absolutes[i]);
            }
        }
        return answer;
    }
}