class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i < j){
            int area = Math.abs(j - i) * Math.min(height[i], height[j]);
            if(height[i] <= height[j]){
              i++;
            }
            else {
                j--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}