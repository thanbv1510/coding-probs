#include<stdio.h>
#include<stdbool.h>

/**
* https://leetcode.com/problems/search-insert-position/
*/
int searchInsert(int* nums, int numsSize, int target){
    int start = 0;
    int end = numsSize - 1;
    int mid = (start + end) / 2;
    while(start <= end) {
        if (nums[mid] == target) {
            return mid;
        }
        
        if (nums[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        
        mid = (start + end) / 2;
    }

    return start;
}
