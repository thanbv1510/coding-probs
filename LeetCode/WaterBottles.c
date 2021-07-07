/**
 * https://leetcode.com/problems/water-bottles
 */

#include<stdio.h>

int numWaterBottles(int numBottles, int numExchange){
    int total = numBottles;

    while(numBottles >= numExchange) {
        total += numBottles / numExchange;
        numBottles = (numBottles % numExchange) + (numBottles / numExchange);
    }

    return total;
}


int main() {
    int numBottles;
    int numExchange;

    printf("%d %d", &numBottles, numExchange);

    printf("%d", numWaterBottles(numBottles, numExchange));

    return 0;
}
