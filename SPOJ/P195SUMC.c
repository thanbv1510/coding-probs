/**
 * https://www.spoj.com/PTIT/problems/P195SUMC/
 */

#include<stdio.h>
#include<stdbool.h>
#define TICKETPRICE 25

void makeArr(int arr[], int numSize) {
    for (int i = 0; i < numSize; i ++) {
        scanf("%d", &arr[i]);
    }
}

bool isSaleCorrect(int moneyArr[], int sizeNum) {
    int count = 0;
    for (int i = 0; i < sizeNum; i ++) {
        if (moneyArr[i] == TICKETPRICE) {
            count ++;
        } else {
            int numberRefund = moneyArr[i] / TICKETPRICE;
            count -= (numberRefund - 1);
            if (count < 0) {
                return false;
            }
        }
    }

    return true;
}

int main() {
    int sizeNum;
    scanf("%d", &sizeNum);

    int moneyArr[sizeNum];
    makeArr(moneyArr, sizeNum);

    printf("%s", isSaleCorrect(moneyArr, sizeNum) ? "YES" : "NO");

    return 0;
}
