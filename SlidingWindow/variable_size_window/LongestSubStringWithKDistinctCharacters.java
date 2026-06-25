import java.util.*;
class Solution {
    public int longestKSubstr(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while(map.size() > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength, (right - left + 1));
            right++;
        }
        if(map.size() < k){
            return -1;
        }
        return maxLength;
    }
}