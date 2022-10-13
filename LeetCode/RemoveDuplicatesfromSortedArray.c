/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

#include<stdio.h>

int removeDuplicates(int *nums, int numsSize) {
    int index = 1;
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[index] = nums[i];
            index++;
        }
    }

    return index;
}

int main() {
    // case 1: [1,1,2]
    // case 2: [0,0,1,1,1,2,2,3,3,4]
    int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    printf("%d", removeDuplicates(nums, 10));

    return 0;
}
