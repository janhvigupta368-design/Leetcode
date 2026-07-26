class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int n=nums.length;
     int max=nums[0]*nums[1]*nums[n-1];
     int max1=nums[n-1]*nums[n-2]*nums[n-3];
     int maxi=Math.max(max,max1);
     return maxi;
     
    }
}