class Solution {
    static boolean solve(int[] weights, int days,int mid){
        int count=1;int postion=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+postion>mid){
                count++;
                postion=weights[i];
            }
            else{
                postion+=weights[i];
            }
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int end=0; int start=0; int ans=-1;
        for(int i=0;i<weights.length;i++){
            start=Math.max(start,weights[i]);

            end+=weights[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(solve(weights,days,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
}