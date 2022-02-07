import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern/
 */
class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> data = new HashMap<>();
        Map<String, Character> temp = new HashMap<>();
        StringBuilder word = new StringBuilder();
        int patternIdx = 0;
        String wordStr;
        for (int i = 0; i <= s.length(); i++) {
            if (patternIdx >= pattern.length()) {
                return false;
            }

            if (i == s.length() || s.charAt(i) == 32) {
                char patternChar = pattern.charAt(patternIdx++);
                wordStr = word.toString();
                if ((data.containsKey(patternChar) && !wordStr.equals(data.get(patternChar))
                        || (temp.containsKey(wordStr) && patternChar != temp.get(wordStr)))) {
                    return false;
                }

                data.put(patternChar, wordStr);
                temp.put(wordStr, patternChar);
                word.setLength(0);
                continue;
            }

            word.append(s.charAt(i));
        }

        return patternIdx == pattern.length();
    }
}
