/**
 * https://leetcode.com/problems/reverse-integer
 */

#include<stdio.h>

int reverse(int x){
    int sum = 0;
    int maxInt = 2147483647; // (2 ^ (31)) - 1
    int minInt = -2147483648; // - (2 ^ (31))

    while(x != 0) {
        int balance = x % 10;
        
        if (sum > maxInt / 10 || (sum == maxInt / 10 && balance > 7)
            || sum < minInt / 10 || (sum == minInt / 10 && balance < -8)) {
            return 0;
        }
        
        sum = sum * 10 + balance;
        x /= 10;
    }
    
    return sum;
}

int main() {
    int testNum;
    scanf("%d", &testNum);

    printf("%d", reverse(testNum));

    return 0;
}