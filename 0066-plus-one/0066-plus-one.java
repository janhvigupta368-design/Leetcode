class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the least significant digit (rightmost)
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0 and carries over to the next place
            digits[i] = 0;
        }
        
        // If all digits were 9 (e.g., [9, 9, 9]), we need a new array with an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The most significant digit becomes 1, and the rest are 0 by default
        return newDigits;
    }
}