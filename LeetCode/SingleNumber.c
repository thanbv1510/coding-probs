/**
 * https://leetcode.com/problems/single-number
 */

#include<stdio.h>

/**
 * 1 XOR 0 || 0 XOR 1 = 1
 * O XOR 0 || 1 XOR 1 = 0
 * => a XOR 0 || O XOR a = a
 * => 0 XOR 0 || a XOR a = 0
 */
int singleNumber(int* nums, int numsSize){
    int result = 0;
    for (int i = 0; i < numsSize; i ++) {
        result ^= nums[i];
    }
    
    return result;
}

int main() {
    int numsSize;
    scanf("%d", &numsSize);

    int nums[numsSize];
    for (int i = 0; i < numsSize; i ++) {
        scanf("%d", & nums[i]);
    }

    printf("%d", singleNumber(nums, numsSize));
    
    return 0;
}
