import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        temp.push(s.charAt(0));
        final Map<Character, Integer> DATA_CHAR =
                Stream.of(new Object[][]{
                        {'(', 1},
                        {'[', 1},
                        {'{', 1},
                }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

        final Map<String, Integer> DATA_STR =
                Stream.of(new Object[][]{
                        {"()", 1},
                        {"[]", 1},
                        {"{}", 1},
                }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

        for (int i = 1; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            Character prevChar = temp.isEmpty() ? ' ' : temp.peek();
            if (DATA_STR.containsKey(prevChar + "" + currentChar) && DATA_CHAR.containsKey(prevChar)) {
                temp.pop();
                continue;
            }

            temp.push(currentChar);
        }

        return temp.isEmpty();
    }
}