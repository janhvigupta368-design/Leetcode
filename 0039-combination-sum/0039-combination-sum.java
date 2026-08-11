class Solution {
    static void solve(int[] candidates,int target,int index, List<Integer> output, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length||target<0){
            return;
        }
        int currentvalue=candidates[index];
        output.add(currentvalue);
         solve(candidates,target-currentvalue,index,output,ans);
        output.remove(output.size()-1);
        solve(candidates,target,index+1,output,ans); 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,index,output,ans);
        return ans;
        

    }
}