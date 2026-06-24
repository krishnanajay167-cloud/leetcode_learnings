import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashSet<Character> hs = new HashSet<>();
        int maxLen = 0;
        while(r < s.length()){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            r++;
            maxLen = Math.max(maxLen, hs.size());
        }
        return maxLen;
    }
}