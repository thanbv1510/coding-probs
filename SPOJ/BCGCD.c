/**
 * https://www.spoj.com/PTIT/problems/BCGCD/
 */

#include<stdio.h>

// Euclidean algorithm
long long gcd(long long number1, long long number2) {
    while(number2 != 0) {
        long long temp = number2;
        number2 = number1 % number2;
        number1 = temp;
    }

    return number1;
}

int main() {
    long long number1;
    long long number2;
    
    while(1) {
        scanf("%lli", &number1);
        scanf("%lli", &number2);
    
        if (number1 == 0 && number2 == 0) {
            break;
        }

        printf("%lli %lli\n", gcd(number1, number2), (number1 * number2) / gcd(number1, number2));
    }

    return 0;
}
