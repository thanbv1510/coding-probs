/**
 * https://leetcode.com/problems/shuffle-string/
 */

#include<stdio.h>

char* restoreString(char * s, int* indices, int indicesSize){
    char result[indicesSize + 1];
    for (int i = 0; i < indicesSize; i ++) {
        result[indices[i]] = s[i];
    }
    result[indicesSize] = '\0';
    char *s_ptr = result;
    
    return s_ptr;
}

int main() {

    int indicesSize = 8;
    char* s = "codeleet";
    int indices[] = {4,5,6,7,0,2,1,3};

    printf("%s", restoreString(s, indices, indicesSize));

    return 0;
}