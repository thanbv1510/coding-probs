/**
 * https://www.spoj.com/PTIT/problems/BCVTAB/
 */

#include <stdio.h>
    
long long sum(long long a, long long b) {
    scanf("%lli", &a);
    scanf("%lli", &b);
    
    return a + b;
}
    
int main(void) {
    long long a;
    long long b;
    
    long long total = sum(a, b);
    printf("%lli", total);
    
    return 0;
}
