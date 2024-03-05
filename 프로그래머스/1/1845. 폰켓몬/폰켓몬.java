import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hash = new HashSet<>();  
        int max = nums.length / 2;
        
        for(int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        if (hash.size() < max) {
            answer += hash.size();
        } else {
            answer += max;
        }
        return answer;
    }
}