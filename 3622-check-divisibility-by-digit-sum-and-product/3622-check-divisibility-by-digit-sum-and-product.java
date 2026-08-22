class Solution {
    public boolean checkDivisibility(int n) {
        // Intuition: split into digits via string, then sum/multiply them
        String s = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += digit;
            product *= digit;
        }
        return n % (sum + product) == 0;
    }
}