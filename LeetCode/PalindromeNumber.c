/**
 * https://leetcode.com/problems/palindrome-number
 */

#include<stdio.h>
#include<stdbool.h>

bool isPalindrome(int x){
    if (x < 0) return false;
    
    int maxInt = 2147483647; // (2 ^ (31)) - 1
    int minInt = -2147483648; // - (2 ^ (31))
    
    int palindromeNum = 0;
    int temp = x;
    while(x != 0) {
        int balance = x % 10;
        
            if (palindromeNum > maxInt / 10 
                || (palindromeNum == maxInt / 10 && balance > 7)
                || palindromeNum < minInt / 10 
                || (palindromeNum == minInt / 10 && balance < -8)) {
            return false;
        }
        
        palindromeNum = (palindromeNum * 10) + balance;
        x /= 10;
    }

    return temp == palindromeNum;
}


int main () {
    int x;
    scanf("%d", &x);

    printf("%s", isPalindrome(x) ? "true" : "false");

    return 0;
}
