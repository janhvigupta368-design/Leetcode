class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];
        leftsum[0]=nums[0];
        for(int i=1;i<n;i++){
            leftsum[i]=nums[i]+leftsum[i-1];
        }
        rightsum[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            rightsum[j]=rightsum[j+1]+nums[j];
        }
        for(int i=0;i<n;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}