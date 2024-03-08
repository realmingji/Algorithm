class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] c = my_string.toCharArray();
        char[] c_index = new char[index_list.length];
        
        for(int i=0; i<c_index.length; i++){
             // System.out.print(c[i]);
           c_index[i] = c[index_list[i]];
        }
        
        for (int i=0; i <c_index.length; i++) {
            answer += c_index[i];
        }
        
        return answer;
    }
}