/**
 * https://www.spoj.com/PTIT/problems/BCPALIN/
 */

#include<stdio.h>
#include<stdbool.h>
 
bool isSymmetryNumber(long long number) {
    long long numberTmp = number;
    if (numberTmp < 10) {
        return 1;
    }
 
    long long symmetryNumber = 0;
    while(numberTmp != 0) {
        symmetryNumber = symmetryNumber * 10 + numberTmp % 10;
        numberTmp /= 10;
    }
 
    if (symmetryNumber == number) {
        return 1;
    }
 
    return 0;
}
 
int main() {
    long long testNumber;
    scanf("%lli", &testNumber);
 
    long long number;
    while(testNumber -- > 0) {
        scanf("%lli", &number);
        printf(isSymmetryNumber(number) ? "YES\n" : "NO\n");
    }
 
    return 0;
}
