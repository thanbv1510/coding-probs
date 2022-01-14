/**
 * https://leetcode.com/problems/reverse-string/
 */
class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i <= s.length / 2; i++) {
            s[i] += s[s.length - 1 - i];
            s[s.length - 1 - i] = (char) (s[i] - s[s.length - 1 - i]);
            s[i] -= s[s.length - 1 - i];
        }
    }
}
