/**
 * https://leetcode.com/problems/can-place-flowers
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[Math.max(i - 1, 0)] == 0
                    && flowerbed[Math.min(i + 1, flowerbed.length - 1)] == 0
                    && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
        }

        return false;
    }
}
