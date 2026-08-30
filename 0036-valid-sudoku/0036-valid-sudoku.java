class Solution {
    static boolean valid(char[][] board,int r,int c,boolean[][] row,boolean[][] col,boolean[][] box){
        if(r==9){
            return true;
        }
        if(c==9){
            return valid(board,r+1,0,row,col,box);
        }
        if(board[r][c]=='.'){
            return valid(board,r,c+1,row,col,box);
       }
       int val=board[r][c]-'1';
       int boxIndex=(r/3)*3+(c/3);
       if(row[r][val]||col[c][val]||box[boxIndex][val]){
        return false;
       }
       row[r][val]=true;col[c][val]=true;box[boxIndex][val]=true;
       return valid(board,r,c+1,row,col,box);

    }
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] box=new boolean[9][9];
        return valid(board,0,0,row,col,box);
        
    }
}