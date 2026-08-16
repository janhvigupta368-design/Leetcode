class Solution {
    public int[][] generateMatrix(int n) {
        int sR=0;int eR=n-1;int eC=n-1;int sC=0;
        int[][] ans=new int[n][n];
        int count=1;
        while(sR<=eR && sC <=eC){
            for(int j=sC;j<=eC;j++){
                ans[sR][j]=count++;
              }
             sR++;
            for(int i=sR;i<=eR;i++){
                ans[i][eC]=count++;
            }
            eC--;
           if(sR<=eR){
            for(int j=eC;j>=sC;j--){
                ans[eR][j] =count++;
            }
            eR--; 
           }
            if(sC<=eC){
                for(int i=eR;i>=sR;i--){
                ans[i][sC]=count++;
            }
            sC++;
        } 
            }
       return ans;
        }

}
