class Solution {
    public int solution(int a, int b) {
        int answer = 0, mul = 0;
        String merge = Integer.toString(a) + Integer.toString(b);
        mul = 2 * a * b;
        
        if(Integer.parseInt(merge) > mul) {
            answer = Integer.parseInt(merge);
        } else {
            answer = mul;
        }
        return answer;
    }
}