class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String e = "";
        String o = "";
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0){
                e += Integer.toString(num_list[i]);
            } else {
                o += Integer.toString(num_list[i]);
            }
        }
        int E = Integer.parseInt(e);
        int O = Integer.parseInt(o);
        return answer = E + O;
    }
}