class Solution {
    static int solve(int [][] matrix,int sR,int eR,int sC,int eC,List<Integer> ans){
   while(sR<=eR && sC<=eC){
            for(int j=sC;j<=eC;j++){
                ans.add(matrix[sR][j]);
            }
            sR++;
            for(int i=sR;i<=eR;i++){
                ans.add(matrix[i][eC]);
            }
            eC--;
            if(sR<=eR){
                for(int j=eC;j>=sC;j--){
                    ans.add(matrix[eR][j]);
                }
            }
            eR--;
            if(sC<=eC){
                for(int i=eR;i>=sR;i--){
                    ans.add(matrix[i][sC]);
                }
            }
            sC++;
        }
        return 0;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int eR=matrix.length-1;int sR=0; int eC=matrix[0].length-1;int sC=0;
        List<Integer> ans=new ArrayList<>();
        solve(matrix,sR,eR,sC,eC,ans);
        return ans;
        
        
    }
}