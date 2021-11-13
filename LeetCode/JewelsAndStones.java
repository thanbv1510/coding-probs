import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> data = new HashMap<>();
        stones.chars().forEach(c -> {
            char key = (char) c;
            int value = data.getOrDefault(key, 0) + 1;
            data.put(key, value);
        });

        return jewels.chars().map(c -> data.getOrDefault((char) c, 0)).sum();
    }
}
