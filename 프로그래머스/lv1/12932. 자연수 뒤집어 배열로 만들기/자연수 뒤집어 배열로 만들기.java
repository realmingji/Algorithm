class Solution {
    public int[] solution(long n) {
        // int이니깐 문자열로 바꿔주는게 낫지 않을까?

        String s = Long.toString(n);    // long -> str 
        // System.out.println(s);
        char[] arr = s.toCharArray();
        int[] answer = new int[s.length()]; // [0,0,0,0,0]
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[arr.length - i - 1] -'0';
        }
        return answer;
    }
}