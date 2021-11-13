/**
* https://www.spoj.com/PTIT/problems/P166SUMI/
*/

#include<stdio.h>
#include<stdbool.h>

bool checkWorking(int nums[], int numSize) {
   int zeroNums = 0;
   for(int i = 0; i <= numSize / 2; i ++) {
       if (nums[i] == 0) {
           zeroNums ++;
       }

        if (nums[numSize - i - 1] == 0) {
            zeroNums ++;
        }

        if (zeroNums > 1) {
            return false;
        } 
   }

    return zeroNums == 0 ? false : true;
}

int main() {
   int numSize;
   scanf("%d", &numSize);

   int nums[numSize];
   for (int i = 0; i < numSize; i ++) {
       scanf("%d", &nums[i]);
   }
   
   printf("%s\n", checkWorking(nums, numSize) ? "YES" : "NO");
   
    return 0;
}
