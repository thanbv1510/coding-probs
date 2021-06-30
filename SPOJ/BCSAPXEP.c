/**
 * https://www.spoj.com/PTIT/problems/BCSAPXEP/
 */

#include<stdio.h>
    
void printArr(int arrNum[], int size) {
    for (int i = 0; i < size; i ++) {
        printf("%d\n", arrNum[i]);
    }
}
    
void bubbleSort(int arrNum[], int size) {
    for (int i = 0; i < size - 1; i ++) {
        for (int j = i + 1; j < size; j ++) {
            if (arrNum[j] < arrNum[i]) {
                int tmp = arrNum[j];
                arrNum[j] = arrNum[i];
                arrNum[i] = tmp;
            }
        }
    }
    
    printArr(arrNum, size);
}
    
int main() {
    int size;
    scanf("%d", &size);
    
    int arrNum[size];
    for (int i = 0; i < size; i ++) {
        scanf("%d", &arrNum[i]);
    }
    
    bubbleSort(arrNum, size);
    
    return 0;
}
