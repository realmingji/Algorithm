class Solution {
    public int[] solution(int[] arr, int n) {    
        int len = arr.length;
        if(len % 2 == 0) {   // 짝수면?
            for(int i = 1; i< arr.length; i+=2) {
                arr[i] += n;
            }
        } else {    // 홀수면?
            for(int i = 0; i< arr.length; i+=2) {
                arr[i] += n;
            }
        }        
        return arr;
    }
}