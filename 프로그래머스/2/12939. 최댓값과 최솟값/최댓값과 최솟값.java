class Solution {
    public String solution(String s) {
        String[] blank = s.split(" ");
        String answer1 = blank[0];  
        String answer2 = blank[0];
        
        for(int i=0; i<blank.length; i++) {
            int num = Integer.parseInt(blank[i]);
            if(num > Integer.parseInt(answer1)) {
                answer1 = blank[i];
            } 
            if(num < Integer.parseInt(answer2)){
                answer2 = blank[i];
            }
        }
        return answer2 + " " + answer1;
    }
}