/**
 * https://www.spoj.com/PTIT/problems/BCFACTOR/
 */

#include<stdio.h>
#include<stdbool.h>
#include<math.h>

bool isPrime(int number) {
    if (number < 2) {
        return 0;
    }
    
    for (int i = 2; i <= sqrt(number); i++) {
        if (number % i == 0) {
            return 0;
        }
    }
    
    return 1;
}

void analyzePrime (long long number) {
    long long index = 2;
    
    if (isPrime(number)) {
        printf("%lli %lli", number, 1);
        return;
    }
    
    while(number / index != 0) {
        if (number % index == 0) {
            long long count = 0;
            while(number % index == 0) {
                number /= index;
                count ++;
            }
            printf("%lli %lli\n", index, count);
        } else {
            index ++;
        }
    }
    
    if (number > 1) {
        printf("%lli %lli", number, 1);
    }
}

int main(void) {
    long long number;
    scanf("%lli", &number);
    
    analyzePrime(number);
    
    return 0;
}
