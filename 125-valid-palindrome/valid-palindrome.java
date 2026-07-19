class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {  
            return true;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char startChar = s.charAt(left);
            char endChar = s.charAt(right);

            if (!Character.isLetterOrDigit(startChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                right--;
                continue;
            }

            if (startChar != endChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}