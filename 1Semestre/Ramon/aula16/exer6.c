#include <stdio.h>
#include <stdlib.h>

int main () {
    int valores[10];
    int i, maior, menor;
    maior=valores[0];
    menor=valores[0];
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
    if(valores[i]<menor){
        menor=valores[i];
    }
    }
    
    
    
    printf("O menor valor é %d:\n", menor);
    printf("O maior valor é %d:\n", maior);

}
    
