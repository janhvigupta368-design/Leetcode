class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        // isComposite[i] represents odd number (2 * i + 3)
        // Array size is half of n
        boolean[] isComposite = new boolean[n / 2];
        int count = 1; // Count 2 as a prime initially

        for (int i = 0; 2 * i + 3 < n; i++) {
            if (!isComposite[i]) {
                count++;
                int prime = 2 * i + 3;
                
                // Avoid integer overflow for prime * prime
                if ((long) prime * prime < n) {
                    // Mark odd multiples starting from prime * prime
                    for (int j = (prime * prime - 3) / 2; j < n / 2; j += prime) {
                        isComposite[j] = true;
                    }
                }
            }
        }

        return count;
    }
}