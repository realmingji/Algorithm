class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;   // 0의 개수
        int cnt = 0;    // 숫자 같은지 
        int[] answer = new int[2];
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            } else {
                for(int j=0; j<win_nums.length; j++){
                    if (lottos[i] == win_nums[j]){
                        cnt++;
                        break; // 이미 맞는 숫자를 찾았으므로 다음 번호로 넘어감
                    }            
                }
            }          
        }

        // 최고 자리
        answer[0] = getRank(cnt + zero);
        
        // 최저 자리
        answer[1] = getRank(cnt);
        
        return answer;
    }
    
    private int getRank(int count) {
        switch(count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
