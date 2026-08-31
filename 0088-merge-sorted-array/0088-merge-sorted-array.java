class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n;
        int[] nums=new int[p];
        int i=0;int j=0;int k=0;
        while(i<m&& j<n){
            if(nums1[i]<=nums2[j]){
                nums[k]=nums1[i];
                k++;
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;k++;
            }
        }
        while(j<n){
            nums[k]=nums2[j];
            k++;j++;
        }
        while(i<m){
            nums[k]=nums1[i];
            k++;i++;
        }
        for(int x=0;x<p;x++){
            nums1[x]=nums[x];
        }
        
    }
}