#include <stdio.h>

int main() {
    float numero1, numero2;
    printf("Digite o primeiro numero: ");
    scanf("%f%*c", &numero1);
    printf("Digite o segundo numero: ");
    scanf("%f%*c", &numero2);
    if( (numero1>numero2) ){
        printf("O maior numero é:%f ", numero1);
    }
    if(numero2>numero1){
        printf("O numero é:%f ", numero2);
    }
    if(numero1==numero2){
        printf("Os numeros são iguais");
     }
}