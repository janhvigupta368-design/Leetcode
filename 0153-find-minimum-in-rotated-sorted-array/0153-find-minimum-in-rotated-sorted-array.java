class Solution {
    static int solve(int[] nums,int start,int end){
        if(start==end){
            return nums[start];
        }
        int mid=start+(end-start)/2;
        if(nums[mid]> nums[end]){
                   return solve(nums,mid+1,end);
        }
        else{
           return solve(nums,start,mid);
        }

    }
    public int findMin(int[] nums) {
        int start=0;int end=nums.length-1;
         return solve(nums,start,end);
    }
}