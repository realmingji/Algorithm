class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0, total=45;
        
        for (int i= 0; i<numbers.length; i++){
            sum = sum + numbers[i];

        }
        return total-sum;
    }
}