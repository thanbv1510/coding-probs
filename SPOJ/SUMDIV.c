/**
 * https://www.spoj.com/PTIT/problems/SUMDIV/
 */

#include<stdio.h>
#include<math.h>
#include<stdbool.h>
    
bool isSqrt(long long number) {
    long long sqrtNum = sqrt(number);
    
    if (sqrt(number) - sqrtNum == 0) {
        return 1;
    }
    
    return 0;
}
    
long long sumDiv(long long number) {
    if (number == 1) {
        return 1;
    }
    
    long long result = 0;
    long long sqrtNum = sqrt(number);
    for(long long i = 1; i <= sqrtNum; i ++) {
        if (number % i == 0) {
            result += (i + number / i);
    
            if (i == sqrtNum && isSqrt(number)) {
                result -= sqrtNum;
            }
        }
    }
    
    return result;
}
    
int main() {
    long long testNumber;
    scanf("%lli", &testNumber);
    
    long long number;
    while(testNumber -- > 0) {
        scanf("%lli", &number);
        printf("%lli\n", sumDiv(number));
    }
    
    return 0;
}
