/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        return strs.length <= 1 ? strs[0] : subEqualStr(0, strs[0].length(), strs);
    }

    public static String subEqualStr(int start, int end, String[] strs) {
        if (start < end) {
            StringBuilder result = new StringBuilder();
            int mid = start + (end - start) / 2;
            String s1 = subEqualStr(start, mid, strs);
            if (mid - start + 1 != s1.length()) {
                return s1;
            }

            result.append(s1).append(subEqualStr(mid + 1, end, strs));

            return result.toString();
        }

        String str0 = strs[0];
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i >= str0.length()) {
                return "";
            }

            char tempChar = str0.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || tempChar != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(tempChar);
        }

        return result.toString();
    }
}
