/**
 * https://www.spoj.com/PTIT/problems/P195SUMA/
 */

#include<stdio.h>
#include <stdlib.h>

int cmpfunc (const void * a, const void * b) {
   return ( *(int*)a - *(int*)b );
}

void makeArr(long long arr[], long long sizeNum) {
    for (long long i = 0; i < sizeNum; i ++) {
        scanf("%lld", &arr[i]);
    }
}

long long findNumCorrect(long long arr[], long long sizeNum, long long findNum) {
    qsort(arr, sizeNum, sizeof(long long), cmpfunc);

    if (findNum == 0) {
        return arr[0] != 1 ? 1 : -1;
    }

    if (findNum == sizeNum) {
        return arr[sizeNum - 1];
    }

    return (arr[findNum - 1] == arr[findNum]) ? -1 : arr[findNum - 1];
}

int main() {
    long long sizeNum;
    long long findNum;
    scanf("%lld %lld", &sizeNum, &findNum);

    long long arr[sizeNum];
    makeArr(arr, sizeNum);

    printf("%lld\n", findNumCorrect(arr, sizeNum, findNum));

    return 0;
}
