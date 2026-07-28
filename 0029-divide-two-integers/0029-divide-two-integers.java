class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend==Integer.MIN_VALUE && divisor ==-1){
              return Integer.MAX_VALUE;
         }
         boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert both inputs to positive long values to prevent overflow with Integer.MIN_VALUE
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;
        

        // Iterate through bit positions from 31 down to 0
        for (int i = 31; i >= 0; i--) {
            // Check if (dvs * 2^i) <= dvd using bit shift (dvs << i)
            if ((dvd >> i) >= dvs) {
                quotient += (1 << i); // Add 2^i to the result
                dvd -= (dvs << i);   // Subtract (dvs * 2^i) from dividend
            }
        }

        return isNegative ? -quotient : quotient;
    }
}