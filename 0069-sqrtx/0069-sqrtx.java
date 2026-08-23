class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            // Use this formula to prevent integer overflow when calculating mid
            int mid = left + (right - left) / 2;

            // If mid is the exact square root
            if (mid == x / mid) {
                return mid;
            } 
            // If mid squared is smaller than x, we might need a larger number.
            // We store mid as a potential answer because we round down.
            else if (mid < x / mid) {
                ans = mid;
                left = mid + 1;
            } 
            // If mid squared is larger than x, we need a smaller number.
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}