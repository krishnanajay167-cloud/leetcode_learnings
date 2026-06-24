class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] frq1 = new int[26];
        for(int i = 0;i < s1.length();i++){
            char ch = s1.charAt(i);
            frq1[ch - 'a']++;
        }
        int[] frq2 = new int[26];
        for(int i = 0;i < s1.length();i++){
           char ch = s2.charAt(i);
           frq2[ch - 'a']++;
        }
        boolean isvalid = true;
           for(int k = 0;k < 26;k++){
             if(frq1[k] != frq2[k]){
                isvalid = false;
                break;
             }
           }
           if(isvalid){
            return true;
           }
        int i = 0;
        int j = s1.length();
        while(j < s2.length()){
           frq2[s2.charAt(i) - 'a']--;
           i++;
           frq2[s2.charAt(j) - 'a']++;
           j++;
           boolean valid = true;
           for(int k = 0;k < 26;k++){
             if(frq1[k] != frq2[k]){
                valid = false;
                break;
             }
           }
           if(valid){
            return true;
           }
        }
        return false;
    }
}