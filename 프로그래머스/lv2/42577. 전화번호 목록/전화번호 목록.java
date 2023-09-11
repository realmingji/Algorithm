// ["123","456","789"]에 번호를 하나씩 빼내서 비교하자? => 시간초과
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        // System.out.println(Arrays.toString(phone_book));
        for(int i=0; i<phone_book.length-1; i++){
            // System.out.println(i);  // -1이 없으면 0 1 2 3 4이고, -1을 하면 0 1 2 3이다. 
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
