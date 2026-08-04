import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int start=0;
       for(int i=nums[0];i<=nums[nums.length-1];i++){
        if(i==nums[start]){
            start++;
        }
        else{
            ans.add(i);
        }

       }
       return ans;
    }
}