/**
 * https://leetcode.com/problems/excel-sheet-column-title
 */
class ExcelSheetColumnTitle {
    public static final int Z_NUMBER_IN_EXCEL = 26;
    public static final int VAL_CHAR_BEFORE_A_LETTER_IN_ASCII = 64;

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > Z_NUMBER_IN_EXCEL) {
            int mod = columnNumber % Z_NUMBER_IN_EXCEL;
            if (mod == 0) {
                columnNumber -= 1;
                mod = Z_NUMBER_IN_EXCEL;
            }

            result.insert(0, (char) (mod + VAL_CHAR_BEFORE_A_LETTER_IN_ASCII));

            columnNumber /= Z_NUMBER_IN_EXCEL;
        }

        result.insert(0, (char) (columnNumber + VAL_CHAR_BEFORE_A_LETTER_IN_ASCII));

        return result.toString();
    }
}
