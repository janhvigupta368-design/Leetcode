class Solution {
    static boolean solve(int[] m,int target){
        int start=0;int end=m.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(m[mid]==target){
                return true;
            }
                if(m[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
        }
        return false;
    }
        public boolean searchMatrix(int[][] matrix, int target) {
         if(matrix==null|| matrix.length==0||matrix[0].length==0){
            return false;
         }
         for(int i=0;i<matrix.length;i++){
           if (solve(matrix[i],target)){
            return true;
           }
         }
         return false;
    }
}