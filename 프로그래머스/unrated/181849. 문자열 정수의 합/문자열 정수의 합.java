class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] n = num_str.split("");
        System.out.println(n);
        
        for(int i = 0; i < n.length; i++){
            answer += Integer.parseInt(n[i]);
        }
        return answer;
    }
}