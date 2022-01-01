/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        int length = columnTitle.length();
        int index1 = length - 1;
        int index2 = 0;
        double power1 = Math.pow(26, index1);
        double power2 = 1;
        for (int i = 0; i <= length / 2; i++) {
            sum += ((columnTitle.charAt(i) - 64) * power1);
            power1 /= 26;
            if (index1 != index2 && (length - 1 - i) > length / 2) {
                sum += ((columnTitle.charAt(length - 1 - i) - 64) * power2);
                power2 *= 26;
            }
        }
        return sum;
    }
}
