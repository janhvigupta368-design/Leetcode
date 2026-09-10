class Solution {
    static boolean solve(int[] quantities,int mid,int n){
        int store=0;
        for(int i:quantities){
           store +=(i+mid-1)/mid;
           if(store>n){
            return false;
           }
        }
        return store<=n;

    }
    public int minimizedMaximum(int n, int[] quantities) {
       Arrays.sort(quantities);
       int start=1; int  end=0; int ans=-1;
       for(int q:quantities){
           end=Math.max(end,q);
       } 
       while(start<=end){
        int mid=start+(end-start)/2;
         if(solve(quantities,mid,n)){
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