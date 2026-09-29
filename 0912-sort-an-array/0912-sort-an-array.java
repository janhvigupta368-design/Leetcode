class Solution {
    static void MergeSort(int[] nums,int s,int e ){
        if(s>=e){
            return;
        }
        else{
            int mid=s+(e-s)/2;
            MergeSort(nums,s,mid);
            MergeSort(nums,mid+1,e);
            Merge(nums,s,mid,e);
        }
    }
    static void Merge(int[] nums,int s,int mid,int e){
        int i=s;int j=mid+1;
        int k=0;
        int[] temp=new int[e-s+1];
        while(i<=mid && j<=e){
            if(nums[i]>nums[j]){
                temp[k++]=nums[j++];
            }
            else{
                temp[k++]=nums[i++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=e){
            temp[k++]=nums[j++];
        }
        for(int p=0;p<temp.length;p++){
            nums[s+p]=temp[p];
        }

    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int s=0;int e=n-1;
        if(nums==null|| nums.length<=1){
            return nums;
        }
            MergeSort(nums,s,e);
        return nums;
    }
}