class Solution {
    static  long solve(int[] piles,int hour){
       long totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours +=Math.ceil((double)piles[i]/hour);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        int low=1; int ans=Integer.MAX_VALUE;
        for(int p: piles){
            high=Math.max(high,p);
        }
        while(low<=high){
            int k=low+(high-low)/2;
             long result=solve(piles,k);
             if(result<=h){
                ans=k;
                high=k-1;
        }
        else{
            low=k+1;
        }
        }
        return ans;
    }
}