import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        List<Integer> anagrams = new ArrayList<>();
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];
        for(int i = 0;i < p.length();i++){
            char ch = p.charAt(i);
            frq1[ch - 'a']++;
        }
        for(int i = 0;i < p.length();i++){
            char ch = s.charAt(i);
            frq2[ch - 'a']++;
        }
        boolean isAnagram = true;
        for(int i = 0;i < 26;i++){
           if(frq1[i] != frq2[i]){
              isAnagram = false;
              break;
           }
        }
        if(isAnagram){
            anagrams.add(0);
        }
        int left = 0;
        int right = p.length();
        while(right < s.length()){
            frq2[s.charAt(left) - 'a']--;
            left++;
            frq2[s.charAt(right) - 'a']++;
            right++;
            boolean valid = true;
            for(int k = 0;k < 26;k++){
                if(frq1[k] != frq2[k]){
                    valid = false;
                    break;
                }
            }
            if(valid){
                anagrams.add(left);
            }
        }
        return anagrams;
    }
}