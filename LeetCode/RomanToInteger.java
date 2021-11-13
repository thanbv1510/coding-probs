import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }


    public static int romanToInt(String s) {
        final Map<Character, Integer> DATA =
                Stream.of(new Object[][]{
                        {'I', 1},
                        {'V', 5},
                        {'X', 10},
                        {'L', 50},
                        {'C', 100},
                        {'D', 500},
                        {'M', 1000}
                }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

        int result = 0;
        int oldData;
        int currentData = 0;
        int j;
        for (int i = 0; i < s.length(); i += j) {
            oldData = currentData;
            currentData = DATA.get(s.charAt(i));
            int k = i + 1;
            while (k <= s.length() - 1 && s.charAt(i) == s.charAt(k)) {
                k += 1;
            }

            j = k - i;
            currentData *= j;
            result = (oldData != 0 && oldData < currentData) ? result + (currentData - 2 * oldData) : result + currentData;
        }

        return result;
    }
}
