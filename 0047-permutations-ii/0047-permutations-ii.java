class Solution {
    static void solve(int[] nums,List<Integer> current, List<List<Integer>> ans,boolean[] a){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !a[i-1]){
                continue;
            }
            a[i]=true;
            current.add(nums[i]);
            solve(nums,current,ans,a);
            a[i]=false;
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> current =new ArrayList<>();
        boolean[] a= new boolean[nums.length];
        Arrays.sort(nums);
        solve(nums,current,ans,a);
        return ans;
    }
}