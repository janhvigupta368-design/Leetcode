class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int start=0;int sum=0;
         int Min=Integer.MAX_VALUE;
         for(int end=0;end<n;end++) {
            sum=sum+nums[end];
            while(sum>=target){
                Min=Math.min(Min,end-start+1);
                sum=sum-nums[start];
                start++;
            }

        
         }
         return Min==Integer.MAX_VALUE?0:Min;


    }
}