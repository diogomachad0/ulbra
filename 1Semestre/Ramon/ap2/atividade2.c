#include <stdio.h>

int main () {
    
    int valores[6], i;

    for(i=0;i<6;i++){
        printf("Digite o valor\n");
        scanf("%d%*c", &valores[i]);
    }

    for(i=0;i<6;i++){
        printf("Valor digitado:%d\n", valores[i]);
    }
}