/**
 * https://www.spoj.com/PTIT/problems/BCFACT/
 */

#include<stdio.h>

long long factorial(long long number) {
    long long result = number;
    for (int i = 2; i <= number / 2; i ++) {
        result *= (i * (number + 1  - i));
    }
    
    if (number % 2 != 0) {
        result *= (number /2 ) + 1;
    }
    
    return result;
}
    
int main () {
    long long number;
    while(number != 0){
        scanf("%lli", &number);
        if (number != 0) {
            printf("%lli\n", factorial(number));
        }
    }
    
    return 0;
}
