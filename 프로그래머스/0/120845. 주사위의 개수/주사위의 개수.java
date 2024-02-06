class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i = 0; i < box.length; i++){
            if(box[i] % n == 0 || box[i] % n == 1 || box[i] % n == 2 || box[i] % n == 3 || box[i] % n == 4 || box[i] % n == 5 || box[i] % n == 6 || box[i] % n == 7 || box[i] % n == 8 || box[i] % n == 9){
                answer *= box[i] / n;
            }
        }
        return answer; 
    }
}