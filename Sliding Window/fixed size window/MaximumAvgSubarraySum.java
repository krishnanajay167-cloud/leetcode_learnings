class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int i = 0;
        for(i = 0;i < k;i++){
            currentSum += nums[i];
        }
        maxSum = Math.max(maxSum , currentSum);
        while(i < nums.length){
          int sum = currentSum - nums[i - k] + nums[i];
          maxSum = Math.max(maxSum, sum);
          currentSum = sum;
          i++;
        }
        return (double)maxSum/k;
    }
}