// [1번][2번] 있따고 치자, 안겹칠 경우와 겹칠 경우도 고려해야한다
import  java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String clothingType = clothes[i][1];
            clothesMap.put(clothingType, clothesMap.getOrDefault(clothingType, 0) + 1);
        }
        
        int answer = 1;
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}