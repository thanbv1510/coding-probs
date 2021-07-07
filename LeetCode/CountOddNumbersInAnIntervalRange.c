/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
 */

#include<stdio.h>

int countOdds(int low, int high){
    return  (high % 2 != 0 ? (high + 1) / 2 : high / 2) - (low % 2 != 0 ? (low - 1) / 2 : low / 2);
}

int main() {
    int low;
    int high;

    printf("%d %d", &low, &high);

    printf("%d", countOdds(low, high));

    return 0;
}
