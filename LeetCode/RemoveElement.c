#include <stdio.h>

/**
 * https://leetcode.com/problems/remove-element/
 */

int removeElement(int *nums, int numsSize, int val) {
    int leftIndex = 0;
    int rightIndex = numsSize - 1;
    while (leftIndex <= rightIndex) {
        if (nums[leftIndex] != val) {
            leftIndex++;
        }

        if (nums[rightIndex] == val) {
            rightIndex--;
        }

        if(leftIndex >= numsSize || rightIndex < 0) {
            break;
        }

        if (nums[leftIndex] == val && nums[rightIndex] != val) {
            nums[leftIndex] = nums[rightIndex];
            rightIndex --;
        }
    }
    return leftIndex;
}

int main() {
    int nums[] = {4, 5};

    removeElement(nums, 2, 5);

    return 0;
}