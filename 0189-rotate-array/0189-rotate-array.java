class Solution {
    void solve(int[] nums,int start ,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }

    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int start=0;int end=n-1;
        solve(nums,start,end);
        solve(nums,start,k-1);
        solve(nums,k,end);
    }
}