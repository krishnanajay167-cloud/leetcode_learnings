class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int maxCount = 0;
        int c = 0;
        int gf = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gf < g.length && c < s.length){
            if(s[c] >= g[gf]){
                maxCount++;
                gf++;
                c++;
            }
            else {
                c++;
            }
        }
        return maxCount;
    }
}