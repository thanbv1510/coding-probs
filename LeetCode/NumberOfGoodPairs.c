/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */

#include<stdio.h>

int numIdenticalPairs(int* nums, int numsSize){
    int total = 0;
    for (int i = 0; i < numsSize - 1; i ++) {
        for (int j = i + 1; j < numsSize; j ++) {
            if (nums[i] == nums[j]) {
                total ++;
            }
        }
    }

    return total;
}

int main() {
    int* nums;
    int numsSize;

    printf("%d", &numsSize);

    for (int i = 0; i < nums; i ++) {
        printf("%d", &nums[i]);
    }

    printf("%d", numIdenticalPairs(nums, numsSize));

    return 0;
}
