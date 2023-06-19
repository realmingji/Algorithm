class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;   // 0의 개수
        int cnt = 0;    // 숫자 같은지 
        int[] answer = new int[2];
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    cnt++;
                }            
            }
            if(lottos[i]==0){
                zero++;
            }           
        }
// 순위           6 - (맞은 갯수 + 1)
// 6개 중 6개 맞음 => 1등     6-6+1
// 6개 중 5개 맞음 => 2등     6-5+1
// 6개 중 4개 맞음 => 3등     6-4+1
// 6개 중 3개 맞음 => 4등     6-3+1
// 6개 중 2개 맞음 => 5등     6-2+1
// 6개 중 1개 맞거나 0개 맞으면 => 낙첨 6-1+1
        
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