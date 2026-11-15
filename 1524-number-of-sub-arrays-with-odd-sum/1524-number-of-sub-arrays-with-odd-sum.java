class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int evenCount = 1; // Empty prefix has sum 0 (even)
        int oddCount = 0;
        int prefixSum = 0;
        int totalSubarrays = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 1) {
                // Current prefix sum is odd: pair with previous even prefix sums
                totalSubarrays = (totalSubarrays + evenCount) % MOD;
                oddCount++;
            } else {
                // Current prefix sum is even: pair with previous odd prefix sums
                totalSubarrays = (totalSubarrays + oddCount) % MOD;
                evenCount++;
            }
        }

        return totalSubarrays;
    }
}
