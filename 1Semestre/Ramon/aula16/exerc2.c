#include <stdio.h>

int main () {
    int valores[6], i;

    for(i=0; i<6; i++){
    printf("Digite 6 valores inteiros:\n");
    scanf("%d%*c", &valores[i]);
    }

    for(i=0; i<6; i++){
        printf("O valor digitado foi:%d", valores[i]);
    }
}