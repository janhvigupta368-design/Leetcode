class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSumMap=new HashMap<>();
        prefixSumMap.put(0,1);
        int currentSum =0;
        int count=0;
        for(int num:nums){
            currentSum += num;
            int target = currentSum - k;
            if (prefixSumMap.containsKey(target)) {
                count += prefixSumMap.get(target);
            }
           prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        } 
        return count;
        
    }
}