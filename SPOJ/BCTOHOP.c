/**
 * https://www.spoj.com/PTIT/problems/BCTOHOP/
 */

#include<stdio.h>
#include<stdbool.h>

void printArr(int arr[], int size) {
    for (int i = 0; i < size; i ++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void makeArr(int arr[], int sizeNum) {
    for (int i = 0; i < sizeNum; i ++) {
        arr[i] = i + 1;
    }
}

bool isLastNumber(int arr[], int sizeNum, int maxNum) {
    int count = 0;
    for (int i = sizeNum - 1; i >= 0; i --) {
        if (arr[i] != maxNum - count) {
            return false;
        }

        count ++;
    }

    return true;
}

void genCombinationNumber(int sizeNum, int maxNum) {
    int arr[sizeNum];
    makeArr(arr, sizeNum);
    printArr(arr, sizeNum);

    while(1) {
        int count = 0;
        for (int i = sizeNum - 1; i >= 0; i --) {
            int maxCurrent = maxNum - count;
            if (arr[i] < maxCurrent) {
                arr[i] += 1;

                for (int j = i + 1; j < sizeNum; j ++) {
                    arr[j] = arr[j - 1] + 1;
                }

                break;
            }

            count ++;
        }

        printArr(arr, sizeNum);

        if (isLastNumber(arr, sizeNum, maxNum)) {
            break;
        } 
    }
}

int main() {
    int sizeNum;
    int maxNum;
    scanf("%d %d", &maxNum,  &sizeNum);

    genCombinationNumber(sizeNum, maxNum);

    return 0;
}
