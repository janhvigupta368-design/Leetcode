class Solution {
    public int reverse(int x) {
        int sum=0;
        int rev;
        while(x!=0){
         rev= x % 10;
          x= x / 10;
        
        if((sum>Integer.MAX_VALUE/10)|| (sum==Integer.MAX_VALUE/10&& rev>7)){
            return 0;
        }
        if((sum<Integer.MIN_VALUE/10) ||rev==Integer.MIN_VALUE/10 && rev<-8){
            return 0;
        }
        sum=sum*10+rev;
        }
        return sum;
    }
}