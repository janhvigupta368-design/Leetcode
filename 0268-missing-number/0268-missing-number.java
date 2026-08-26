class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;
        for(int num=0;num<nums.length;num++){
           ans^=num;
           ans^=nums[num];
        }
        return ans;
    }
}