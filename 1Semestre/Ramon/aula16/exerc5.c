#include <stdio.h>

int main () {
    int valores[10], i, pares;
    pares = 0;

    for(i=0; i<10; i++){
        printf("Digite %d posição do valor:\n", valores[i]);
      scanf("%d%*c", &valores[i]);
    }if(valores[i]%2==0){
        pares++;
    }
    printf("Numeros pares: %d", pares);

}