#include <stdio.h>
#include <stdlib.h>

int main () {
    int valores[10];
    int i, maior;
    maior=valores[0];
    printf("Digite 10 valores:\n");
    for(i=0;i<10;i++){
    printf("Valor %d:\n", i);
    scanf("%d%*c", &valores[i]);
    if(i==0){
      maior=valores[i];
      }
        
        if(valores[i]>maior){
            maior=valores[i];
    }
    }
    
    printf("O maior valor é %d:\n", maior);
