class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] currentString = new char[n * 2]; 
        backtrack(result, currentString, 0, 0, 0, n);
        return result;
        
    }
    private void backtrack(List<String> result, char[] currentString, int index, int open, int close, int max){
        if (index == max * 2) {
            result.add(new String(currentString));
            return;
        }
        if (open < max) {
            currentString[index] = '(';
            backtrack(result, currentString, index + 1, open + 1, close, max);
        }
        if (close < open) {
            currentString[index] = ')';
            backtrack(result, currentString, index + 1, open, close + 1, max);
        }
    }
}