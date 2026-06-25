import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> baskets = new HashMap<>();
        int maxLength = 0;
        while(right < fruits.length){
            baskets.put(fruits[right], baskets.getOrDefault(fruits[right], 0) + 1);
            while(baskets.size() > 2){
                baskets.put(fruits[left], baskets.get(fruits[left]) - 1);
                if(baskets.get(fruits[left]) == 0){
                    baskets.remove(fruits[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }
}