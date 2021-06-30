/**
 * https://www.spoj.com/PTIT/problems/BCPRIME/
 */

#include<stdio.h>
#include<math.h>
#include<stdbool.h>
 
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
 
int main() {
    int number; 
    scanf("%d",&number);
 
    printf(isPrime(number) ? "YES" : "NO");
    
    return 0;
}
