#include <stdio.h>

int main(){

  int i;

  float numeros[10], quadrados[10];

  for(i = 0; i < 10; i++){

    scanf("%f%*c", &numeros[i]);

 }

 for(i = 0; i < 10; i++){

   quadrados[i] = numeros[i] * numeros[i];

 }

 for(i = 0; i < 10; i++){

     printf("%.2f", numeros[i]);

 }

 printf("\n");

 for(i = 0; i < 10; i++){

    printf("%.2f", quadrados[i]);

 }
}