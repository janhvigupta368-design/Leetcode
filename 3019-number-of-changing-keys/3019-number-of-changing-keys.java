class Solution {
    public int countKeyChanges(String s) {
        int changes = 0;
        // Convert the string to lowercase to ignore case differences (e.g., 'a' == 'A')
        s = s.toLowerCase();
        
        // Iterate through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            // If the current character is different from the previous one, it's a key change
            if (s.charAt(i) != s.charAt(i - 1)) {
                changes++;
            }
        }
        
        return changes;
    }
}