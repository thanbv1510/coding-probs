/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
       /*
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        if (s.length() <= 1) {
            return true;
        }

        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        */

        int startIdx = 0;
        int endIdx = s.length() - 1;
        while (startIdx <= endIdx) {
            char startChar = s.charAt(startIdx);
            char endChar = s.charAt(endIdx);
            if (isNotValidChar(startChar) || isNotValidChar(endChar)) {
                startIdx = isNotValidChar(startChar) ? startIdx + 1 : startIdx;
                endIdx = isNotValidChar(endChar) ? endIdx - 1 : endIdx;
                continue;
            }

            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            startIdx++;
            endIdx--;
        }

        return true;
    }

    public static boolean isNotValidChar(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }
}
