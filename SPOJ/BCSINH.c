/**
 * https://www.spoj.com/PTIT/problems/BCSINH/
 */

#include<stdio.h>
#include<stdbool.h>

void printArr(int arr[], int size) {
    for (int i = 0; i < size; i ++) {
        printf("%d", arr[i]);
    }
    printf("\n");
}

bool isLastNumber(int arr[], int size) {
    for (int i = 0; i < size; i ++) {
        if (arr[i] == 0) {
            return false;
        }
    }
    
    return true;
}

void genBinaryNumber(int testNumber) {
    int binaryArr[10] = {0};
    printArr(binaryArr, testNumber);

    while(1) {
        for (int i = testNumber - 1; i >= 0; i --) {
            if (binaryArr[i] == 0) {
                binaryArr[i] = 1;

                for (int j = i + 1; j < testNumber; j ++) {
                    binaryArr[j] = 0;
                }
                break;
            }
        }

        printArr(binaryArr, testNumber);

        if (isLastNumber(binaryArr, testNumber)) {
            break;
        }
    }
}

int main() {
    int testNumber;
    scanf("%d", &testNumber);

    genBinaryNumber(testNumber);

    return 0;
}
