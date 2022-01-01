/**
 * https://leetcode.com/problems/add-binary/
 */
class AddBinary {
    public static String addBinary(String a, String b) {
        int indexa = a.length() - 1;
        int indexb = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int temp = 0;
        while (indexa >= 0 || indexb >= 0 || temp > 0) {
            int bita = indexa >= 0 ? (a.charAt(indexa--) - 48) : 0;
            int bitb = indexb >= 0 ? (b.charAt(indexb--) - 48) : 0;
            int sum = bita + bitb + temp;
            temp = sum > 1 ? 1 : 0;
            sum = sum > 1 ? sum % 2 : sum;

            result.insert(0, sum);
        }

        return result.toString();
    }
}
