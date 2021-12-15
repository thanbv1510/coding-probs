import java.util.Arrays;

/*
 * https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 */
public class QueriesOnNumberOfPointsInsideACircle {
    public static int[] countPoints(int[][] points, int[][] queries) {
        final int xIndex = 0, yIndex = 1, zIndex = 2;
        int x1, x2, y1, y2;
        int[] query;
        double tempRadius;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            query = queries[i];
            x1 = query[xIndex] - query[zIndex];
            x2 = query[xIndex] + query[zIndex];
            y1 = query[yIndex] - query[zIndex];
            y2 = query[yIndex] + query[zIndex];
            for (int[] point : points) {
                tempRadius = Math.sqrt(Math.pow((point[xIndex] - query[xIndex]), 2) + Math.pow((point[yIndex] - query[yIndex]), 2));
                if (point[xIndex] < x1 || point[xIndex] > x2 || point[yIndex] < y1 || point[yIndex] > y2
                        || (point[xIndex] == x1 && point[yIndex] == y1)
                        || (point[xIndex] == x1 && point[yIndex] == y2)
                        || (point[xIndex] == x2 && point[yIndex] == y1)
                        || (point[xIndex] == x2 && point[yIndex] == y2)
                        || tempRadius > query[zIndex]) {
                    continue;
                }
                result[i]++;
            }
        }

        return result;
    }
}
