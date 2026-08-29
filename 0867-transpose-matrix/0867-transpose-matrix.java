class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] ans=new int[col][row];
        for(int i=0;i<row;i++){
            int j=0;
            while(j<col){
                ans[j][i]=matrix[i][j];
                j++;
            }
        }
        return ans;
        
    }
}