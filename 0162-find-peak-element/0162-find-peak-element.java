class Solution {
    static int solve(int[] nums,int start,int end){
        if(start==end){
            return end;
        }
        int mid=start+(end-start)/2;
        if(nums[mid+1]>nums[mid]){
            start=mid+1;
            return solve(nums,start,end);
        }
        else{
            end=mid;
            return solve(nums,start,end);
        }
    }
    public int findPeakElement(int[] nums) {
        int start=0;int end=nums.length-1;
       return  solve(nums,start,end);
        
    }
}